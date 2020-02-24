package main.tasks;

//      what is the result?
//
//      No output is produced.
//
// public void ThreeConst() - это не конструктор!!!
// поэтому ничего не будет выведено!!!

public class ThreeConst {

    public static void main(String [] args) {
        new ThreeConst();
    }

    public void ThreeConst(int x) {
        System.out.print(" " + (x * 2));
    }

    public void ThreeConst(long x) {
        System.out.print(" " + x);
    }

    public void ThreeConst() {
        System.out.print("no-arg ");
    }
}
