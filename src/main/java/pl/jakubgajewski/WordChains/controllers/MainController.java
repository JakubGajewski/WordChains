package pl.jakubgajewski.WordChains.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.jakubgajewski.WordChains.utils.InputValidator;
import pl.jakubgajewski.WordChains.utils.PathFinder;
import pl.jakubgajewski.WordChains.models.EdgesCreator;
import pl.jakubgajewski.WordChains.models.VerticiesCreator;

import java.util.List;
import java.util.Set;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @PostMapping("/")
    public String getResult(@RequestParam("startWord") String startWord, @RequestParam("endWord") String endWord, Model model) {

        List<String> verticies = VerticiesCreator.createVerticies(startWord.length());
        String validation = InputValidator.validateInput(startWord,endWord,verticies);
        if (!InputValidator.validateInput(startWord,endWord,verticies).equals("inputIsCorrect")) {
            model.addAttribute("message", validation);
            return "index";
        }
        List<Set<Integer>> edges = EdgesCreator.createEdges(verticies);
        model.addAttribute("message", PathFinder.findPath(startWord, endWord, verticies, edges));
        return "index";
    }
}
