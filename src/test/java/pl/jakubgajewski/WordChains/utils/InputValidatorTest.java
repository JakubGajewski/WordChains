package pl.jakubgajewski.WordChains.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InputValidatorTest {

    @Test
    public void validateInput() {
        List<String> verticiesMock = new ArrayList<>(10);
        verticiesMock.add("XX");
        verticiesMock.add("AA");
        verticiesMock.add("AB");
        verticiesMock.add("BB");
        verticiesMock.add("XY");
        verticiesMock.add("QWE");
        verticiesMock.add("QWe");
        verticiesMock.add("Qwe");
        verticiesMock.add("Awe");
        verticiesMock.add("awe");

        assertEquals("inputIsCorrect", InputValidator.validateInput("AA", "BB", verticiesMock));
        assertEquals("inputIsCorrect", InputValidator.validateInput("QWE", "awe", verticiesMock));
        assertEquals("Two words should have the same length!", InputValidator.validateInput("QWE", "fajnie", verticiesMock));
        assertEquals("Start and end word can not be the same!", InputValidator.validateInput("super", "super", verticiesMock));
        assertEquals("inputIsCorrect", InputValidator.validateInput("QWE", "awe", verticiesMock));
        assertEquals("We don't have these words in our dictionary, please try with different words, and remember that case matters!", InputValidator.validateInput("OMOMOM", "chomik", verticiesMock));

        }

    }
