public class PerformanceComparison {

    private String linearSearchResult = "Not yet performed";
    private String binarySearchResult = "Not yet performed";
    private String bfsResult = "Not yet performed";
    private String dfsResult = "Not yet performed";

    public void recordLinearSearch(int target, int steps, long nanos, boolean found) {
        linearSearchResult = String.format("target=%d  steps=%d  time=%d ns  %s",
                target, steps, nanos, found ? "FOUND" : "NOT FOUND");
    }

    public void recordBinarySearch(int target, int steps, long nanos, boolean found) {
        binarySearchResult = String.format("target=%d  steps=%d  time=%d ns  %s",
                target, steps, nanos, found ? "FOUND" : "NOT FOUND");
    }

    public void recordBfs(String start, int steps, long nanos) {
        bfsResult = String.format("start=%s  vertices visited=%d  time=%d ns", start, steps, nanos);
    }

    public void recordDfs(String start, int steps, long nanos) {
        dfsResult = String.format("start=%s  vertices visited=%d  time=%d ns", start, steps, nanos);
    }

    public void display() {
        System.out.println("=============================================");
        System.out.println(" PERFORMANCE COMPARISON");
        System.out.println("=============================================");
        System.out.printf("%-18s %-16s %s%n", "Operation", "Algorithm", "Result");
        System.out.println("------------------------------------------------");
        System.out.printf("%-18s %-16s %s%n", "Search", "Linear Search", linearSearchResult);
        System.out.printf("%-18s %-16s %s%n", "Search", "Binary Search", binarySearchResult);
        System.out.printf("%-18s %-16s %s%n", "Graph Traversal", "BFS", bfsResult);
        System.out.printf("%-18s %-16s %s%n", "Graph Traversal", "DFS", dfsResult);
        System.out.println("=============================================");
        System.out.println("Note: Linear Search checks elements one by one (O(n)), so its");
        System.out.println("step count grows directly with array size. Binary Search halves");
        System.out.println("the search space each step (O(log n)), so it generally takes far");
        System.out.println("fewer steps on larger, sorted data. BFS and DFS visit every");
        System.out.println("reachable vertex once (O(V+E)), but in different orders, which is");
        System.out.println("why their visited lists can differ even when the step count matches.");
    }
}
