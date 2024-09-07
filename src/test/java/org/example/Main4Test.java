package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main4Test {

    @Test
    void testCalculateSeriesSum() {
        double result = Main4.calculateSeriesSum();

        assertTrue(result > 0, "Результат должен быть больше 0");
        assertTrue(result < 10, "Результат должен быть меньше 10");
    }
}
