package main.algo.workOfStrings;

public class LongestPalindromeFinder {

    public static void main(String[] args) {
        System.out.println(longestPalindromeString("1234"));
        System.out.println(longestPalindromeString("12321"));
        System.out.println(longestPalindromeString("9912321456"));
        System.out.println(longestPalindromeString("9912333321456"));
        System.out.println(longestPalindromeString("12145445499"));
    }

    public static String longestPalindromeString(String in) {
        char[] input = in.toCharArray();
        int longestPalindromeStart = 0;
        int longestPalindromeEnd = 0;

        for (int mid = 0; mid < input.length; mid++) {
            // для случая нечетного палиндрома как 12321, 3 будет серединой
            int left = mid-1;
            int right = mid+1;
            // нам необходимо двигаться влево и вправо на 1 позицию до конца
            while (left >= 0 && right < input.length) {
                // ниже проверка, является ли это палиндромом
                if (input[left] == input[right]) {
                    // обновление глобальных позиций, только если палиндром длиннее имеющегося
                    if (right - left > longestPalindromeEnd
                            - longestPalindromeStart) {
                        longestPalindromeStart = left;
                        longestPalindromeEnd = right;
                    }
                }
                left--;
                right++;
            }
            // для четного палиндрома у нас должна быть подобная логика с размером середины 2
            // для этого мы начнем на одну позицию правее
            left = mid-1;
            right = mid + 2;// к примеру, для 12333321 мы выбрали 33 в качестве середины
            while (left >= 0 && right < input.length)
            {
                if (input[left] == input[right]) {
                    if (right - left > longestPalindromeEnd
                            - longestPalindromeStart) {
                        longestPalindromeStart = left;
                        longestPalindromeEnd = right;
                    }
                }
                left--;
                right++;
            }
        }
        // теперь у нас есть позиции для самого длинного палиндрома
        return in.substring(longestPalindromeStart, longestPalindromeEnd + 1);
    }
}