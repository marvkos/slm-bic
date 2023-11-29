package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddTwoPositiveIntegers() {
        // Arrange
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 7;

        // Act
        int result = calculator.Add(a, b);

        // Assert
        assertEquals(12, result);
    }

    @Test
    void testAddTwoNegativeIntegers() {
        Calculator calculator = new Calculator();
        int a = -5;
        int b = -7;

        int result = calculator.Add(a, b);

        assertEquals(-12, result);
    }

    @Test
    void testAddOnePositiveAndOneNegativeIntegers() {
        Calculator calculator = new Calculator();
        int a = -5;
        int b = 7;

        int result = calculator.Add(a, b);

        assertEquals(2, result);
    }
}