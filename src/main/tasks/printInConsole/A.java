package main.tasks.printInConsole;

// что будет выведено в консоль?
// 0 3 1 2 1 2 4 5 aaa

public class A {

    static { System.out.println("0"); }
    {
        System.out.println("1");
    }
    private String s;

    public A() {
        System.out.println("2");
        s = "aaa";
    }
    public String getS() {return s;}
}

class B extends A {
    static { System.out.println("3"); }
    {
        System.out.println("4");
    }
    public B() {
        System.out.println("5");
    }

    public static void main(String[] args) {
        A a = new A();
        a = new B();
        System.out.print(a.getS());
    }
}
