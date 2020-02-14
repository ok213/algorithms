package main.algo.mergeArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoArraysTest {

    @Test
    void testMergeArrays() {
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = MergeTwoArrays.mergeArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6});
        assertArrayEquals(expected, actual);
    }

    @Test
    void testEmptyArrayA() {
        int[] expected = {2, 4, 6};
        int[] actual = MergeTwoArrays.mergeArrays(new int[]{}, new int[]{2, 4, 6});
        assertArrayEquals(expected, actual);
    }

    @Test
    void testEmptyArrayB() {
        int[] expected = {1, 2, 3};
        int[] actual = MergeTwoArrays.mergeArrays(new int[]{1, 2, 3}, new int[]{});
        assertArrayEquals(expected, actual);
    }

    @Test
    void testEmptyArrays() {
        int[] expected = {};
        int[] actual = MergeTwoArrays.mergeArrays(new int[]{}, new int[]{});
        assertArrayEquals(expected, actual);
    }

}