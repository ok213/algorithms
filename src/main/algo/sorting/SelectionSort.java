package main.algo.sorting;

public class SelectionSort {

    public static void iterativeAlgorithm(int[] numbers) {
        int min, temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
    }

    // Рекурсивный алгоритм
    public static void recursiveAlgorithm(int[] array) {
        selectionSort(array, 0);
    }

    private static void selectionSort(int[] array, int left) {
        if (left < array.length - 1) {
            swap(array, left, findMin(array, left));
            selectionSort(array, left + 1);
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int findMin(int[] array, int index) {
        int min = index - 1;
        if(index < array.length - 1) min = findMin(array, index + 1);
        if(array[index] < array[min]) min = index;
        return min;
    }

}
