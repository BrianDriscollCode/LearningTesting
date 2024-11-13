package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    void getMultiplyTest()
    {
        Dollar dollar = new Dollar(5);
        Dollar result = dollar.times(2);
        int amount = result.amount;

        assertEquals(10, amount);
    }

    @Test
    void testEquality()
    {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    @Test
    void testMultiplication()
    {
        Dollar five  = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));

    }

}