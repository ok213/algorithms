package main.tasks.collections;

public class MapCalculateBucket {

    public static void main(String[] args) {

        int capacity = 16;

        int hash = 293847563;
        int bucket = (capacity - 1) & hash;
        System.out.printf("hash = %d   bucket = %d\n", hash, bucket);

        hash = 635475826;
        bucket = (capacity - 1) & hash;
        System.out.printf("hash = %d   bucket = %d\n", hash, bucket);

        hash = -635475826;
        bucket = (capacity - 1) & hash;
        System.out.printf("hash = %d   bucket = %d\n", hash, bucket);

        hash = 0;
        bucket = (capacity - 1) & hash;
        System.out.printf("hash = %d   bucket = %d\n", hash, bucket);

        hash = 1;
        bucket = (capacity - 1) & hash;
        System.out.printf("hash = %d   bucket = %d\n", hash, bucket);

        hash = -1;
        bucket = (capacity - 1) & hash;
        System.out.printf("hash = %d   bucket = %d\n", hash, bucket);

        hash = Integer.MAX_VALUE;
        bucket = (capacity - 1) & hash;
        System.out.printf("hash = %d   bucket = %d\n", hash, bucket);

        hash = Integer.MIN_VALUE;
        bucket = (capacity - 1) & hash;
        System.out.printf("hash = %d   bucket = %d\n", hash, bucket);
    }
}
