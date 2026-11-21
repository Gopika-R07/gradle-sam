
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    // QUESTION 21: SIMPLE INTEREST

    @Test
    public void testSimpleInterest() {

        double result =
                Main.calculateSimpleInterest(5000, 5, 2);

        assertEquals(500.0, result, 0.001);
    }


    // QUESTION 22: AVERAGE OF FIVE NUMBERS

    @Test
    public void testAverage() {

        int[] numbers = {10, 20, 30, 40, 50};

        double result =
                Average.calculateAverage(numbers);

        assertEquals(30.0, result, 0.001);
    }


    // QUESTION 23: VOWEL OR CONSONANT

    @Test
    public void testVowel() {

        assertEquals(
                "Vowel",
                VowelConsonant.checkCharacter('a')
        );
    }

    @Test
    public void testConsonant() {

        assertEquals(
                "Consonant",
                VowelConsonant.checkCharacter('b')
        );
    }

    @Test
    public void testInvalidCharacter() {

        assertEquals(
                "Invalid character",
                VowelConsonant.checkCharacter('5')
        );
    }


    // QUESTION 24: RECTANGLE

    @Test
    public void testRectangleArea() {

        assertEquals(
                50.0,
                Rectangle.calculateArea(10, 5),
                0.001
        );
    }

    @Test
    public void testRectanglePerimeter() {

        assertEquals(
                30.0,
                Rectangle.calculatePerimeter(10, 5),
                0.001
        );
    }
}
