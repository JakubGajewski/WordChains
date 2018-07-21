package pl.jakubgajewski.WordChains.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class DictionaryControllerTest {

    @Test
    public void getRightDictionary() {
        DictionaryController dictionaryController = new DictionaryController();
        assertEquals("src/main/resources/dictionaries/D15.txt", dictionaryController.getRightDictionary(15));
        assertEquals("src/main/resources/dictionaries/Dlonger.txt", dictionaryController.getRightDictionary(16));
        int length = 1 + (int)Math.random()*14;
        assertEquals("src/main/resources/dictionaries/D".concat(String.valueOf(length).concat(".txt")), dictionaryController.getRightDictionary(length));
    }
}