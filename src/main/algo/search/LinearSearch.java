package main.algo.search;

public class LinearSearch {

    public static String search(int[] array, int value) {

        double time = System.nanoTime();
        int count  = 0;
        for (; count < array.length; count++) {
            if (array[count] == value) {
                break;
            }
        }
        time = System.nanoTime() - time;

        return String.format("Linear search:   value = %d   steps: %d   elapsed %,9.3f ms", value, count, time / 1_000_000.0);
    }
}
