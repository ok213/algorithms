package main.tasks;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class YandexTask01Test {

    @Test
    void rleOneCharacter() {
        String expected = "A";
        String actual = YandexTask01.rle("A");
        assertEquals(expected, actual);
    }

    @Test
    void rleSameCharacters() {
        String expected = "A5";
        String actual = YandexTask01.rle("AAAAA");
        assertEquals(expected, actual);
    }

    @Test
    void rle() {
        String expected = "A4B3C2XYZD4E3F3A6B28";
        String actual = YandexTask01.rle("AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        assertEquals(expected, actual);
    }

    @Test
    void rleExceptionForNull() throws IllegalArgumentException {
        Throwable thrown = assertThrows(IllegalArgumentException.class,
        () -> {
            YandexTask01.rle(null);
        });
        assertNotNull(thrown.getMessage());
    }

    @Test
    void rleExceptionWrongFormatNumder() throws IllegalArgumentException {
        Throwable thrown = assertThrows(IllegalArgumentException.class,
                () -> {
                    YandexTask01.rle("AAA3BB");
                });
        assertNotNull(thrown.getMessage());
    }

    @Test
    void rleExceptionWrongFormatLowerCase() throws IllegalArgumentException {
        Throwable thrown = assertThrows(IllegalArgumentException.class,
                () -> {
                    YandexTask01.rle("AAaBB");
                });
        assertNotNull(thrown.getMessage());
    }

}
