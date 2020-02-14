package main.tasks.printInConsole;

// что будет выведено в консоль?
// true true false true

public class Task02 {

    public static void main(String[] args) {
        String a = "1";
        String b = "1";
        String c = new String("1");

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}
