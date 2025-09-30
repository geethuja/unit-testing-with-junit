package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddTwoNumbers(){
        assertEquals(5, calc.add(2,3));
    }

    @Test
    public void addShouldNotReturnWrongResult(){
        int result = calc.add(3,7);
        assertNotEquals(5, result, "3+7 should not be 5");
    }
}
