package main.tasks.printInConsole;

// что будет выведено в консоль?

public class Task04 {

    public static void main(String[] args) {
        int i = 5;
        System.out.println(i++);            // 5
        System.out.println(--i);            // 5
        System.out.println(i-- + ++i);      // 10
    }
}
