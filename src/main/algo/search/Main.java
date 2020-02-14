package main.algo.search;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] array = IntStream.range(0, 1000).toArray();
        int value = (int) (Math.random() * 1000);

        System.out.println(LinearSearch.search(array, value));
        System.out.println(BinarySearch.search(array, value));

    }
}
