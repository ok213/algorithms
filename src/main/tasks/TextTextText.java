package main.tasks;

import java.util.ArrayDeque;
import java.util.Deque;

// Задание:
// {текст}(текст)[текст] - true; (текст{текст[текст]}) - true; ([текст)] - false; текст - false
public class TextTextText {

    public static void main(String[] args) {

        System.out.println(validstring("{текст}(текст)[текст]"));
        System.out.println(validstring("(текст{текст[текст]})"));
        System.out.println(validstring("([текст)]"));
        System.out.println(validstring("текст"));

    }

    public static boolean validstring(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        char charStart = str.charAt(0);
        char charFinish = str.charAt(str.length() - 1);
        if (charStart != '(' && charStart != '{' && charStart != '[') {
            return false;
        }
        if (charFinish != ')' && charFinish != '}' && charFinish != ']') {
            return false;
        }

        int count = 0;
        Deque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                queue.add(ch);
                count++;
                continue;
            }

            if (ch == ')') {
                if (queue.pollLast() != '(') {
                    return false;
                }
            } else if (ch == '}') {
                if (queue.pollLast() != '{') {
                    return false;
                }
            } else if (ch == ']') {
                if (queue.pollLast() != '[') {
                    return false;
                }
            }
        }
        return count != 0 ? true : false;
    }
}
