package edu.secourse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertAll(
                () -> assertEquals(2, Calculator.add(1, 1)),
                () -> assertEquals(2, Calculator.add(2, 0)),
                () -> assertEquals(-1, Calculator.add(2, -3))
        );
    }

    @Test
    void multiply() {
        assertAll(
                () -> assertEquals(6, Calculator.multiply(2, 3)),
                () -> assertEquals(0, Calculator.multiply(5, 0)),
                () -> assertEquals(-8, Calculator.multiply(2, -4)),
                () -> assertEquals(-0, Calculator.multiply(-3, 0))
        );
    }

    @Test
    void sqrt(){
        assertAll(
                () -> assertEquals(2, Calculator.sqrt(4)),
                () -> assertEquals(0, Calculator.sqrt(0))
        );
    }
}

