package main.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextTextTextTest {

    @Test
    void validstring01() {
        // {текст}(текст)[текст] - true;
        Boolean expected = true;
        Boolean actual = TextTextText.validstring("{текст}(текст)[текст]");
        assertEquals(expected, actual);
    }

    @Test
    void validstring02() {
        // (текст{текст[текст]}) - true;
        Boolean expected = true;
        Boolean actual = TextTextText.validstring("(текст{текст[текст]})");
        assertEquals(expected, actual);
    }

    @Test
    void validstring03() {
        // ([текст)] - false;
        Boolean expected = false;
        Boolean actual = TextTextText.validstring("([текст)]");
        assertEquals(expected, actual);
    }

    @Test
    void validstring04() {
        // текст - false
        Boolean expected = false;
        Boolean actual = TextTextText.validstring("текст");
        assertEquals(expected, actual);
    }

    @Test
    void validstring05() {
        Boolean expected = false;
        Boolean actual = TextTextText.validstring("тек[]ст");
        assertEquals(expected, actual);
    }

    @Test
    void validstring06() {
        Boolean expected = false;
        Boolean actual = TextTextText.validstring("текст{}");
        assertEquals(expected, actual);
    }

    @Test
    void validstring07() {
        Boolean expected = false;
        Boolean actual = TextTextText.validstring("");
        assertEquals(expected, actual);
    }

    @Test
    void validstring08() {
        Boolean expected = false;
        Boolean actual = TextTextText.validstring(null);
        assertEquals(expected, actual);
    }

}

