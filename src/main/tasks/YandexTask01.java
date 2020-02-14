package main.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дана строка, состоящая из букв A-Z:
 * "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"
 * Нужно написать функцию RLE, которая на выходе даст строку вида:
 * "A4B3C2XYZD4E3F3A6B28"
 * И сгенерирует любую ошибку, если на вход пришла невалидная строка.
 *
 * Пояснения:
 * 1. Если символ встречается 1 раз, он остается без изменений
 * 2. Если символ повторяется более 1 раза, к нему добавляется количество повторений
 */

public class YandexTask01 {

    public static String rle(String str) throws IllegalArgumentException {

        if (str == null || !Pattern.compile("[A-Z]+").matcher(str).matches()) {
            throw new IllegalArgumentException("ERROR: Empty string or invalid string format!");
        }
        if (str.length() == 1) {
            return str;
        }

        int count = 1;
        char ch = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
                continue;
            }
            sb.append(ch);
            if (count != 1) {
                sb.append(count);
            }
            ch = str.charAt(i);
            count = 1;
        }
        if (count > 1) {
            sb.append(ch);
            sb.append(count);
        } else {
            sb.append(ch);
        }

        return sb.toString();
    }

}

