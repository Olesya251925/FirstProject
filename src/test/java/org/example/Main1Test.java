package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Main1Test {

    @Test
    void testGetFizzBuzz() {
        assertEquals("fizzbuzz", Main1.getFizzBuzz(35)); // Делится и на 5, и на 7
        assertEquals("fizz", Main1.getFizzBuzz(5));      // Делится на 5
        assertEquals("buzz", Main1.getFizzBuzz(7));      // Делится на 7
        assertEquals("4", Main1.getFizzBuzz(4));         // Не делится ни на 5, ни на 7
    }
}
