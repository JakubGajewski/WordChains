package pl.jakubgajewski.WordChains.models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class EdgesCreatorTest {

    @Test
    public void createEdges() {
        Set<Integer> verticesMock0 = new HashSet();
        verticesMock0.add(4);
        Set<Integer> verticesMock1 = new HashSet();
        verticesMock1.add(2);
        Set<Integer> verticesMock2 = new HashSet();
        verticesMock2.add(1);
        verticesMock2.add(3);
        Set<Integer> verticesMock3 = new HashSet();
        verticesMock3.add(2);
        Set<Integer> verticesMock4 = new HashSet();
        verticesMock4.add(0);

        List<Set<Integer>> edgesMock = new ArrayList<>();
        edgesMock.add(verticesMock0);
        edgesMock.add(verticesMock1);
        edgesMock.add(verticesMock2);
        edgesMock.add(verticesMock3);
        edgesMock.add(verticesMock4);

        List<String> verticiesMock = new ArrayList<>(5);
        verticiesMock.add("XX");
        verticiesMock.add("AA");
        verticiesMock.add("AB");
        verticiesMock.add("BB");
        verticiesMock.add("XY");

        assertEquals(edgesMock, EdgesCreator.createEdges(verticiesMock));
    }
}