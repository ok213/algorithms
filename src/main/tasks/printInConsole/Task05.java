package main.tasks.printInConsole;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// что нужно дописать вместо многоточия, чтобы в косоль было выведено число 10

public class Task05 {
    private String s;
    public Task05(String s) {this.s = s;}
    public String getS() {return s;}
    public void setS(String s) {this.s = s;}
    public int hashCode() {return s.hashCode();}
    public boolean equals(Object obj) {
        return obj instanceof Task05 && Objects.equals(s, ((Task05) obj).getS());
    }

    public static void main(String[] args) {
        Map<Task05, Object> map = new HashMap<>();
        final Task05 task05 = new Task05("astring");
        for (int i = 0; i < 10; i++) {
            // . . .
            if (i != 9) {
                map.put(new Task05("astring" + i), new Date());
            }

            map.put(task05, new Date());
        }
        System.out.println(map.keySet().size());
    }
}
