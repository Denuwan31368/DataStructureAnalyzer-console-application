import java.util.Arrays;

public class SearchOperations {


    public static class SearchResult {
        public final int index;   
        public final int steps;   
        public SearchResult(int index, int steps) {
            this.index = index;
            this.steps = steps;
        }
    }

    public SearchResult linearSearch(int[] arr, int target) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == target) return new SearchResult(i, steps);
        }
        return new SearchResult(-1, steps);
    }


    public SearchResult binarySearch(int[] arr, int target) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        int steps = 0;
        int lo = 0, hi = sorted.length - 1;
        while (lo <= hi) {
            steps++;
            int mid = lo + (hi - lo) / 2;
            if (sorted[mid] == target) return new SearchResult(mid, steps);
            if (sorted[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return new SearchResult(-1, steps);
    }
}
