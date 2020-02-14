package main.algo.mergeArrays;

// Есть два отсортированных массива чисел. Нужно вернуть из метода объединенный отсортированный массив.

public class MergeTwoArrays {

    public static int[] mergeArrays(int[] a, int[] b) {
        // System.arrayCopy(from, fromIndex, to, toIndex, count);
        //  from - массив, который копируем
        //  to - массив в которой копируем
        //  fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
        //  toIndex - индекс в массиве to начиная с которого вставляем элементы
        //  count - количество элементов которые берем из массива from и вставляем в массив to

        if (a.length == 0 && b.length == 0) {
            return new int[]{};
        }

        int[] result = new int[a.length + b.length];
        int aIndex = 0, bIndex = 0, i = 0;

        while (i < result.length) {
            if (a.length == 0 || aIndex == a.length) {
                System.arraycopy(b, bIndex, result, i, b.length - bIndex);
                break;
            }
            if (b.length == 0 || bIndex == b.length) {
                System.arraycopy(a, aIndex, result, i, a.length - aIndex);
                break;
            }
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            i++;
        }

        return result;
    }

}
