package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main3Test {

    @Test
    void testSolveQuadraticEquationTwoRoots() {
        String result = Main3.solveQuadraticEquation(2, -4, -6);
        assertEquals("Корни уравнения: 3.0 и -1.0", result);
    }

    @Test
    void testSolveQuadraticEquationOneRoot() {
        String result = Main3.solveQuadraticEquation(3, -12, 12);
        assertEquals("Один корень: 2.0", result);
    }

    @Test
    void testSolveQuadraticEquationNoRoots() {
        String result = Main3.solveQuadraticEquation(5,  -6, 13);
        assertEquals("Нет вещественных корней", result);
    }
}