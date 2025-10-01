package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GraderTest {

    @Test
    void testFiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void testSixtyNineShouldReturnD(){
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void testSeventyNineShouldReturnC(){
        var grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }
    @Test
    void testEightyNineShouldReturnB(){
        var grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void testNinetyFiveShouldReturnA(){
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(95));
    }

    @Test
    void testIllegalArgument(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    grader.determineLetterGrade(-5);
                });
    }

}
