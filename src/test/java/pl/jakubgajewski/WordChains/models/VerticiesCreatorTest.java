package pl.jakubgajewski.WordChains.models;

import org.junit.Test;
import pl.jakubgajewski.WordChains.controllers.DictionaryController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class VerticiesCreatorTest {

    @Test
    public void createVerticies() {
        String oneCharacterDictionaryMock = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z a b c d e f g h i j k l m n o p q r s t u v w x y z";
        List<String> dictionaryMock = Arrays.asList(oneCharacterDictionaryMock.split(" "));
        assertEquals(dictionaryMock, VerticiesCreator.createVerticies(1));
    }
}
