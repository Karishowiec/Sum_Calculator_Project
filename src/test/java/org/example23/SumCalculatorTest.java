package org.example23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    SumCalculator sumCalculator;
    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();


    }

    @Test
    void sumForThree() {
        int sum = sumCalculator.sum(3);
        Assertions.assertEquals(6, sum);

    }

    @Test
    void sumForZero() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()->sumCalculator.sum(0)
        );
    }

    @Test
    void sumForOne() {
        int sum = sumCalculator.sum(1);
        Assertions.assertEquals(1, sum);

    }
}