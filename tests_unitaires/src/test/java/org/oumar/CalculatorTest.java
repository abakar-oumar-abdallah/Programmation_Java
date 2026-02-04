package org.oumar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Somme de deux plus deux")
    void ChecIfSumOfTwoPlusTwoEqualsFour() {
        assertEquals(4, Calculator.summe(2, 2));
    }

    @Test
    @DisplayName("Somme de faux résultat")
    void CheckFoulResulte() {
        assertNotEquals(5, 2, 2);
    }

    @Test
    @DisplayName("La multiplcation de deux fois cinq")
    void CheckIfTwoMultiplyByFiveEqualsTen () {
        assertEquals(10, Calculator.multiply(2, 5));
    }
}