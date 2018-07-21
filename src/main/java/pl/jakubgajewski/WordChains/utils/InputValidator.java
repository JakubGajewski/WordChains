package pl.jakubgajewski.WordChains.utils;

import java.util.List;

public class InputValidator {
    //Checks if user is looking for two different, same-length, existing words

    public static String validateInput(String startWord, String endWord, List<String> verticies) {

        if (startWord.length() != endWord.length()) {
            return "Two words should have the same length!";
        }

        if (startWord.equals(endWord)) {
            return "Start and end word can not be the same!";
        }

        if ((!verticies.contains(startWord)) || (!verticies.contains(startWord))) {
            return "We don't have these words in our dictionary, please try with different words, and remember that case matters!";
        }

        return "inputIsCorrect";
    }
}
