package com.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorParameterizedTest {
    private final Calculator calculator = new Calculator();

    // ----------------- ADD TESTS -----------------

    @ParameterizedTest(name = "add({0}, {1}) = {2}")
    @CsvSource({
            "5, 3, 8",        // positive numbers
            "-5, -3, -8",     // negative numbers
            "5, -3, 2",       // positive + negative
            "7, 0, 7",        // number + zero
            "0, 7, 7"         // zero + number
    })
    void testAdd(int a, int b, int expected) {
        assertEquals(expected, calculator.add(a, b));
    }

    @Test
    void testAddOverflow() {
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MAX_VALUE, 1));
    }

    @Test
    void testAddUnderflow() {
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MIN_VALUE, -1));
    }

    // ----------------- MULTIPLY TESTS -----------------

    @ParameterizedTest(name = "multiply({0}, {1}) = {2}")
    @CsvSource({
            "5, 3, 15",       // positive numbers
            "-5, -3, 15",     // negative numbers
            "5, -3, -15",     // positive × negative
            "5, 0, 0",        // number × zero
            "0, 5, 0",        // zero × number
            "7, 1, 7",        // number × one
            "1, 7, 7"         // one × number
    })
    void testMultiply(int a, int b, int expected) {
        assertEquals(expected, calculator.multiply(a, b));
    }

    @Test
    void testMultiplyOverflow() {
        assertEquals(Integer.MIN_VALUE, calculator.multiply(Integer.MAX_VALUE, 2));
    }

    @Test
    void testMultiplyUnderflow() {
        assertEquals(Integer.MIN_VALUE, calculator.multiply(Integer.MIN_VALUE, 2));
    }
}
