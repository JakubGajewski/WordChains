package pl.jakubgajewski.WordChains.utils;

import java.util.*;

public class PathFinder {
    //Here I've implemented my algorithm, based on breadth-first search

    public static String findPath(String startWord, String endWord, List<String> verticies, List<Set<Integer>> edges) {
        //First we need to get the index of our start word
        Integer indexOfCurrent = verticies.indexOf(startWord);

        //Stack of our next calls; for each step in our search, we poll one from this list
        Deque<Integer> verticiesToCheck = new ArrayDeque<>();
        verticiesToCheck.add(indexOfCurrent);

        //We don't need check one vertex twice, so here we store ones that are already checked
        List<Integer> verticiesAlreadyVisited = new LinkedList<>();

        //If we find the right word, we need to come back step-after-step.
        Map<Integer,Integer> currentsAndPredecessors = new HashMap<>();
        //If two values in the map are the same, we stop our search and return the result.
        currentsAndPredecessors.put(indexOfCurrent, indexOfCurrent);

        while (!verticiesToCheck.isEmpty()) {
            //Let's poll first of verticies from the stack
            indexOfCurrent = verticiesToCheck.pollFirst();
            //And remember we don't have to check it again
            verticiesAlreadyVisited.add(indexOfCurrent);

            if (verticies.get(indexOfCurrent).equals(endWord)) {
                //The right vertex is found! We need now to return the path, which is our word-chain
                //We need to get predecessor from last word from currentsAndPredecessors map, then get it's predecessor
                //and so on, until we come back this way to the stat word

                StringBuilder resultSB = new StringBuilder("Word chain: ").append(startWord).append(" ");
                Deque<Integer> wordChain = new ArrayDeque<>();
                while (!verticies.get(indexOfCurrent).equals(startWord)) {
                    wordChain.addFirst(indexOfCurrent);
                    indexOfCurrent = currentsAndPredecessors.get(indexOfCurrent);
                }
                wordChain.forEach(s -> resultSB.append(verticies.get(s)).append(" "));
                return resultSB.toString().trim();

            } else {
                //If the vertex in not the one we are looking for, we continue our search
                for (Integer i : edges.get(indexOfCurrent)) {
                    if ((!verticiesAlreadyVisited.contains(i) && (!verticiesToCheck.contains(i)))) {
                        verticiesToCheck.add(i);
                        currentsAndPredecessors.put(i, indexOfCurrent);
                        //We look where we can go, and if we haven't been there, we put it to our verticiesToCheck stack
                        //and we map the vertex with it's predecessor in currentsAndPredecessors map
                    }
                }
            }
        }
        return "There is no connection between these elements!";
        //If nothing is found, message is returned
    }
}
