package test.java.com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import main.java.com.example.MathOperations;

public class MathOperationsTest {
    @Test
    public void testAdd() {
        assertEquals(5, MathOperations.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, MathOperations.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, MathOperations.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, MathOperations.divide(6, 3));
    }
}