package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrancTest {

    @Test
    void getMultiplyTest()
    {
        Franc franc = new Franc(5);
        Money result = franc.times(2);
        int amount = result.amount;

        assertEquals(10, amount);
    }

    @Test
    void testMultiplication()
    {
        Franc five  = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));

    }
}