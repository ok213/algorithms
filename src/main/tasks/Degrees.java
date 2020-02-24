package main.tasks;

//  what line will the sine of 75 degrees be output?
//
//  System.out.println(Math.sin(Math.toRadians(75)));
//
//  Math.sin() — возвращает синус указанного в радианах значения.
public class Degrees {
    public static void main(String [] args) {
        System.out.println(Math.sin(75));
        System.out.println(Math.toDegrees(Math.sin(75)));
        System.out.println(Math.sin(Math.toRadians(75)));
        System.out.println(Math.toRadians(Math.sin(75)));
    }
}
