package main.algo;

import java.util.Arrays;

public class Recursion {

    public static void main(String[] args) {

        System.out.println(count(new int[] {10, 2, 13, 8, 57}));
        System.out.println(sum(new int[] {10, 2, 13, 8, 57}));
        System.out.println(max(new int[] {10, 2, 13, 8, 57}));

    }

    // рекурсивно найти максимальное значение в массиве
    public static int max(int[] array) {
        if (array.length == 2) {
            return array[0] > array[1] ? array[0] : array[1];
        }
        int max = max(Arrays.copyOfRange(array, 1, array.length));
        return array[0] > max ? array[0] : max;

    }

    // рекурсивно количество элементов в массиве
    public static int count(int[] array) {
        if (array.length == 1) {
            return 1;
        }
        return 1 + count(Arrays.copyOfRange(array, 1, array.length));
    }

    // рекурсивно сумма всех элементов массива
    public static int sum(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
    }
}
