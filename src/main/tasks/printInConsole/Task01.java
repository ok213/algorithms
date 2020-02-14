package main.tasks.printInConsole;

import java.util.LinkedList;
import java.util.List;

// что будет выведено в консоль?
// false false false

public class Task01 {

    public static void main(String[] args) {
        String str = null;
        System.out.println(str instanceof String);

        LinkedList list = null;
        System.out.println(list instanceof List);

        Object obj = null;
        System.out.println(obj instanceof String);
    }
}
