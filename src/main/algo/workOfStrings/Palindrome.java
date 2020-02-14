package main.algo.workOfStrings;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }

    public static boolean isPalindromeString(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ABA";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindromeString(s));
    }
}
