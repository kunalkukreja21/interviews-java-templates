package org.kunalkukreja;

import java.util.ArrayList;
import java.util.List;

public class GraphDemo {
    public static void main(String[] args) {
        // Create a random graph as an adjacency list.
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(2);
        graph.get(2).add(0);
        graph.get(2).add(1);
        graph.get(3).add(4);
        graph.get(4).add(3);

        // Find the number of connected components.
        System.out.println("Number of connected components: " + findConnectedComponents(graph));
    }

    private static String findConnectedComponents(List<List<Integer>> graph) {
        int n = graph.size();
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(graph, visited, i);
                count++;
            }
        }
        return String.valueOf(count);
    }

    private static void dfs(List<List<Integer>> graph, boolean[] visited, int i) {
        visited[i] = true;
        for (int j : graph.get(i)) {
            if (!visited[j]) {
                dfs(graph, visited, j);
            }
        }
    }
}
