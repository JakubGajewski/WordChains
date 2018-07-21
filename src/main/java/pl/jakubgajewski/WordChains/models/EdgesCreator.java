package pl.jakubgajewski.WordChains.models;

import java.util.*;

public class EdgesCreator {
    //Class is responsible for generating all possible connections between nodes in graph.
    //We use indexed list, where each index is corresponding to the index of graph's vertex.
    //Inside list we store sets of integers, where each integer is corresponding to the index of graph's vertex.

    public static List<Set<Integer>> createEdges(List<String> verticies) {

        List<Set<Integer>> edges = new ArrayList<>(verticies.size());
        for (int i = 0; i < verticies.size(); i++) {
            edges.add(new HashSet<Integer>());
            for (int j = 0; j < verticies.size(); j++) {
                int countDifferentChars = 0;
                if (verticies.get(i).length() != verticies.get(j).length()) {
                    continue;
                }
                for (int k = 0; k < verticies.get(i).length(); k++) {
                    if (verticies.get(i).charAt(k) != verticies.get(j).charAt(k)) {
                        countDifferentChars++;
                    }
                    if (countDifferentChars > 1) {
                        break;
                    }
                }
                if (countDifferentChars == 1) {
                    edges.get(i).add(j);
                }
            }
        }
        return edges;
    }
}
