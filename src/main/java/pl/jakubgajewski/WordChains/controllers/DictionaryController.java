package pl.jakubgajewski.WordChains.controllers;

public class DictionaryController {
    //to speed up my program, I've created 16 differents files, each for another word length

    public static String getRightDictionary (int wordLength) {

        if (wordLength <= 15) {
            return "src/main/resources/dictionaries/D" + wordLength + ".txt";
        }
        return "src/main/resources/dictionaries/Dlonger.txt";
    }
}
