package main.algo.search;

public class BinarySearch {

    public static String search(int[] array, int value) {

        double time = System.nanoTime();
        int result;
        int count = 0;
        int low = 0;
        int high = array.length;
        while (low <= high) {
            count++;
            int mid = (low + high) / 2;
            result = array[mid];
            if (result == value) {
                break;
            }
            if (result > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        time = System.nanoTime() - time;

        return String.format("Binary search:   value = %d   steps: %d   elapsed %,9.3f ms", value, count, time / 1_000_000.0);
    }
}
