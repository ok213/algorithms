package main.tasks;

// посчитать i-е число фибоначчи

import java.math.BigInteger;

public class Fibonacci {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

    public static int getNumberIteratively(int n) {
        if (n == 0) {
            return 0;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    // Рекурсивный способ работает за экспоненциальное время от n.
    // Рекурсивный способ может работать долго, потому что в процессе вычисления
    // функция будет много раз вызываться от одного и того же аргумента
    // (например, при вычислении f(5) функция сделает рекурсивные вызовы к f(4) и f(3),
    // оба рекурсивных вызова обратятся к f(2)), что приведёт к многократному повторению одних и тех же операций.
    public static int getNumberRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return getNumberRecursive(n - 1) + getNumberRecursive(n - 2);
    }

    // матричное умножение двух матриц размера 2 на 2
    public static BigInteger[][] matrixMultiplication(BigInteger[][] a, BigInteger[][] b) {
        // [a00 * b00 + a01 * b10, a00 * b01 + a01 * b11]
        // [a10 * b00 + a11 * b10, a10 * b01 + a11 * b11]
        return new BigInteger[][]{
                {
                    a[0][0].multiply(b[0][0]).add(a[0][1].multiply(b[1][0])),
                    a[0][0].multiply(b[0][1]).add(a[0][1].multiply(b[1][1]))
                },
                {
                    a[1][0].multiply(b[0][0]).add(a[1][1].multiply(b[1][0])),
                    a[1][0].multiply(b[0][1]).add(a[1][1].multiply(b[1][1]))
                },
        };
    }

    // возведение матрицы размера 2 на 2 в степень n
    public static BigInteger[][] matrixPowerFast(BigInteger[][] a, int n) {
        if (n == 0) {
            // любая матрица в нулевой степени равна единичной матрице
            return new BigInteger[][]{
                    {BigInteger.ONE, BigInteger.ZERO},
                    {BigInteger.ZERO, BigInteger.ONE}
            };
        } else if (n % 2 == 0) {
            // a ^ (2k) = (a ^ 2) ^ k
            return matrixPowerFast(matrixMultiplication(a, a), n / 2);
        } else {
            // a ^ (2k + 1) = (a) * (a ^ 2k)
            return matrixMultiplication(matrixPowerFast(a, n - 1), a);
        }
    }

    // функция, возвращающая n-ое число Фибоначчи
    public static BigInteger getNumberMatrix(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        }

        BigInteger[][] a = {
                {BigInteger.ONE, BigInteger.ONE},
                {BigInteger.ONE, BigInteger.ZERO}
        };
        BigInteger[][] powerOfA = matrixPowerFast(a, n - 1);
        // nthFibonacci = powerOfA[0][0] * F_1 + powerOfA[0][0] * F_0 = powerOfA[0][0] * 1 + powerOfA[0][0] * 0
        BigInteger nthFibonacci = powerOfA[0][0];
        return nthFibonacci;
    }

}

