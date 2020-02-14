package main.algo.sorting;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        int[] array = ThreadLocalRandom.current()
                .ints(0, 10_000)
                .distinct()
                .limit(10_000)
                .toArray();

        int[] copiedArray1 = new int[array.length];
        System.arraycopy(array, 0, copiedArray1, 0, array.length);

        int[] copiedArray2 = new int[array.length];
        System.arraycopy(array, 0, copiedArray2, 0, array.length);


        double time = System.nanoTime();
        SelectionSort.iterativeAlgorithm(array);
        time = System.nanoTime() - time;
        System.out.printf("Selection sort (iterative):\t\telapsed %,9.3f ms\n", time / 1_000_000.0);

        time = System.nanoTime();
        SelectionSort.recursiveAlgorithm(copiedArray1);
        time = System.nanoTime() - time;
        System.out.printf("Selection sort (recursive):\t\telapsed %,9.3f ms\n", time / 1_000_000.0);

        time = System.nanoTime();
        QuickSort.sort(copiedArray2, 0, array.length - 1);
        time = System.nanoTime() - time;
        System.out.printf("Quick sort:\t\t\t\t\t\telapsed %,9.3f ms\n", time / 1_000_000.0);

    }

}
