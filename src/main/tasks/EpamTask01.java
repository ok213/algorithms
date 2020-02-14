package main.tasks;

// Что выведет этот код?

public class EpamTask01 {

    public static int print() {
        try {
            System.out.println("try block");
            return 0;
        } finally {
            System.out.println("finally block");
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(print());
    }

}
