package main.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

    @Test
    void getNumberIterativelyZero() {
        int expected = 0;
        int actual = Fibonacci.getNumberIteratively(0);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberIterativelyOne() {
        int expected = 1;
        int actual = Fibonacci.getNumberIteratively(1);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberIterativelyTwo() {
        int expected = 1;
        int actual = Fibonacci.getNumberIteratively(2);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberIterativelyThree() {
        int expected = 2;
        int actual = Fibonacci.getNumberIteratively(3);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberIterativelyFour() {
        int expected = 3;
        int actual = Fibonacci.getNumberIteratively(4);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberIterativelySeven() {
        int expected = 13;
        int actual = Fibonacci.getNumberIteratively(7);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberIterativelySeventeen() {
        int expected = 1597;
        int actual = Fibonacci.getNumberIteratively(17);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberRecursiveZero() {
        int expected = 0;
        int actual = Fibonacci.getNumberRecursive(0);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberRecursiveOne() {
        int expected = 1;
        int actual = Fibonacci.getNumberRecursive(1);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberRecursiveTwo() {
        int expected = 1;
        int actual = Fibonacci.getNumberRecursive(2);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberRecursiveThree() {
        int expected = 2;
        int actual = Fibonacci.getNumberRecursive(3);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberRecursiveFour() {
        int expected = 3;
        int actual = Fibonacci.getNumberRecursive(4);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberRecursiveSeven() {
        int expected = 13;
        int actual = Fibonacci.getNumberRecursive(7);
        assertEquals(expected, actual);
    }

    @Test
    void getNumberRecursiveSeventeen() {
        int expected = 1597;
        int actual = Fibonacci.getNumberRecursive(17);
        assertEquals(expected, actual);
    }

}