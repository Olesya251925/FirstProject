package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main5Test {

    @Test
    void testIsPalindrome() {
        assertTrue(Main5.isPalindrome("дед"));
        assertTrue(Main5.isPalindrome("поп"));
        assertFalse(Main5.isPalindrome("бот"));
        assertTrue(Main5.isPalindrome("анна"));
        assertFalse(Main5.isPalindrome("кошка"));
    }
}
