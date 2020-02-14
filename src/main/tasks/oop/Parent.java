package main.tasks.oop;

class Parent {

    public Parent() {
        method();
//        System.out.println("parent constructor");
    }

    void method() {
        System.out.println("parent method");
    }
}

class Child extends Parent {

    public Child() {
        method();
        System.out.println("child constructor");
    }

    void method() {
        System.out.println("child method");
    }
}

class Main {
    public static void main(String[] args) {
        Parent p = new Child();
    }
}
