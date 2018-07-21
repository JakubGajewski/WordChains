package pl.jakubgajewski.WordChains.models;
import pl.jakubgajewski.WordChains.controllers.DictionaryController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class VerticiesCreator {
    //Class is responsible for reading the dictionary, and every word is one vertex (also called node) in my graph

    public static List<String> createVerticies(Integer startWordLength) {

        String dictionaryName = DictionaryController.getRightDictionary(startWordLength);
        List<String> verticies = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(dictionaryName))) {
            stream.forEach(s -> verticies.add(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return verticies;
    }
}
