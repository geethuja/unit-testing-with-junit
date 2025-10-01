package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAddTwoNumbers(){
        assertEquals(5, calc.add(2,3));
    }

    @Test
    public void testaddShouldNotReturnWrongResult(){
        int result = calc.add(3,7);
        assertNotEquals(5, result, "3+7 should not be 5");
    }

    // Negative numbers
    @Test
    void testAddTwoNegativeNumbers() {
        assertEquals(-8, calc.add(-5, -3));
    }

    // Positive + Negative
    @Test
    void testAddPositiveAndNegative() {
        assertEquals(2, calc.add(5, -3));
    }

    // Zero + Number
    @Test
    void testAddZeroToNumber() {
        assertEquals(7, calc.add(7, 0));
        assertEquals(7, calc.add(0, 7));
    }

    // Edge cases (Integer overflow)
    @Test
    void testAddIntegerOverflow() {
        assertEquals(Integer.MIN_VALUE, calc.add(Integer.MAX_VALUE, 1));
    }

    @Test
    void testAddIntegerUnderflow() {
        assertEquals(Integer.MAX_VALUE, calc.add(Integer.MIN_VALUE, -1));
    }
    // Positive numbers
    @Test
    void testMultiplyTwoPositiveNumbers() {
        assertEquals(15, calc.multiply(5, 3));
    }

    // Negative numbers
    @Test
    void testMultiplyTwoNegativeNumbers() {
        assertEquals(15, calc.multiply(-5, -3));
    }

    // Positive × Negative
    @Test
    void testMultiplyPositiveAndNegative() {
        assertEquals(-15, calc.multiply(5, -3));
    }

    // Multiply by zero
    @Test
    void testMultiplyByZero() {
        assertEquals(0, calc.multiply(5, 0));
        assertEquals(0, calc.multiply(0, 5));
    }

    // Multiply by one
    @Test
    void testMultiplyByOne() {
        assertEquals(7, calc.multiply(7, 1));
        assertEquals(7, calc.multiply(1, 7));
    }

    // Edge cases (Integer overflow)
    @Test
    void testMultiplyIntegerOverflow() {
        assertEquals(Integer.MIN_VALUE, calc.multiply(Integer.MAX_VALUE, 2));
    }

    @Test
    void testMultiplyIntegerUnderflow() {
        assertEquals(Integer.MIN_VALUE, calc.multiply(Integer.MIN_VALUE, 2));
    }
}
