import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
public class GraphOperations {

    public static class TraversalResult {
        public final List<String> order;
        public final int steps;
        public TraversalResult(List<String> order, int steps) {
            this.order = order;
            this.steps = steps;
        }
    }

    private final Map<String, List<String>> adjList = new LinkedHashMap<>();

    public boolean hasVertex(String name) {
        return adjList.containsKey(name);
    }

    public boolean addVertex(String name) {
        if (adjList.containsKey(name)) return false;
        adjList.put(name, new ArrayList<>());
        return true;
    }

    public boolean addEdge(String a, String b) {
        if (!adjList.containsKey(a) || !adjList.containsKey(b)) return false;
        if (adjList.get(a).contains(b)) return false; 
        adjList.get(a).add(b);
        adjList.get(b).add(a);
        return true;
    }

    public boolean isEmpty() { return adjList.isEmpty(); }

    public void displayGraph() {
        if (adjList.isEmpty()) {
            System.out.println("Graph has no vertices yet.");
            return;
        }
        System.out.println("---- Graph (Adjacency List) ----");
        for (String v : adjList.keySet()) {
            System.out.println(v + " -> " + adjList.get(v));
        }
    }

    public TraversalResult bfs(String start) {
        List<String> order = new ArrayList<>();
        if (!adjList.containsKey(start)) return new TraversalResult(order, 0);
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);
        int steps = 0;
        while (!queue.isEmpty()) {
            String cur = queue.poll();
            order.add(cur);
            steps++;
            for (String neighbour : adjList.get(cur)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
        return new TraversalResult(order, steps);
    }

    public TraversalResult dfs(String start) {
        List<String> order = new ArrayList<>();
        if (!adjList.containsKey(start)) return new TraversalResult(order, 0);
        Set<String> visited = new HashSet<>();
        int[] steps = {0};
        dfsHelper(start, visited, order, steps);
        return new TraversalResult(order, steps[0]);
    }

    private void dfsHelper(String cur, Set<String> visited, List<String> order, int[] steps) {
        visited.add(cur);
        order.add(cur);
        steps[0]++;
        for (String neighbour : adjList.get(cur)) {
            if (!visited.contains(neighbour)) {
                dfsHelper(neighbour, visited, order, steps);
            }
        }
    }
}
