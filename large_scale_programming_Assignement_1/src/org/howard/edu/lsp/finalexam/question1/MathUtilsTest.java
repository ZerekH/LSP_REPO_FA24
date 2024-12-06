package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    private final MathUtils mathUtils = new MathUtils();


    @Test
    public void factorial_givenZero_returnsOne() {
        assertEquals(1, mathUtils.factorial(0));
    }

    @Test
    public void factorial_givenPositiveNumber_returnsFactorial() {
        assertEquals(120, mathUtils.factorial(5));
    }

    @Test
    public void factorial_givenNegativeNumber_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1));
    }

    // Tests for isPrime method

    @Test
    public void isPrime_givenNonPrimeNumber_returnsFalse() {
        assertFalse(mathUtils.isPrime(4));
    }

    @Test
    public void isPrime_givenPrimeNumber_returnsTrue() {
        assertTrue(mathUtils.isPrime(7));
    }

    @Test
    public void isPrime_givenOneOrLess_returnsFalse() {
        assertFalse(mathUtils.isPrime(1));
        assertFalse(mathUtils.isPrime(0));
        assertFalse(mathUtils.isPrime(-5));
    }

    // Tests for gcd method

    @Test
    public void gcd_givenTwoPositiveNumbers_returnsCorrectGCD() {
        assertEquals(6, mathUtils.gcd(54, 24));
    }

    @Test
    public void gcd_givenOneZero_returnsAbsoluteNonZeroInput() {
        assertEquals(24, mathUtils.gcd(0, 24));
        assertEquals(54, mathUtils.gcd(54, 0));
    }

    @Test
    public void gcd_givenBothZeros_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0));
    }

    @Test
    public void gcd_givenNegativeNumbers_returnsCorrectGCD() {
        assertEquals(6, mathUtils.gcd(-54, -24));
    }
}
