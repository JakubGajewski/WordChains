package pl.jakubgajewski.WordChains.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class PathFinderTest {

    @Test
    public void findPath() {
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
        Set<Integer> verticesMock5 = new HashSet();
        verticesMock5.add(6);
        Set<Integer> verticesMock6 = new HashSet();
        verticesMock6.add(5);
        verticesMock6.add(7);
        Set<Integer> verticesMock7 = new HashSet();
        verticesMock7.add(6);
        verticesMock7.add(8);
        Set<Integer> verticesMock8 = new HashSet();
        verticesMock8.add(7);
        verticesMock8.add(9);
        Set<Integer> verticesMock9 = new HashSet();
        verticesMock9.add(8);

        List<Set<Integer>> edgesMock = new ArrayList<>();
        edgesMock.add(verticesMock0);
        edgesMock.add(verticesMock1);
        edgesMock.add(verticesMock2);
        edgesMock.add(verticesMock3);
        edgesMock.add(verticesMock4);
        edgesMock.add(verticesMock5);
        edgesMock.add(verticesMock6);
        edgesMock.add(verticesMock7);
        edgesMock.add(verticesMock8);
        edgesMock.add(verticesMock9);

        assertEquals("Word chain: AA AB BB", PathFinder.findPath("AA", "BB", verticiesMock, edgesMock));
        assertEquals("Word chain: XX XY", PathFinder.findPath("XX", "XY", verticiesMock, edgesMock));
        assertEquals("Word chain: awe Awe Qwe QWe QWE", PathFinder.findPath("awe", "QWE", verticiesMock, edgesMock));
        assertEquals("Word chain: QWe Qwe Awe", PathFinder.findPath("QWe", "Awe", verticiesMock, edgesMock));
    }
}