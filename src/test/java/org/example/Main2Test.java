package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main2Test {

    @Test
    void testReverseString() {
        String original = "make install";
        String expected = "llatsni ekam";
        assertEquals(expected, Main2.reverseString(original));
    }
}