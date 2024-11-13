package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    void getMultiplyTest()
    {
        Dollar dollar = new Dollar(5);
        Money result = dollar.times(2);
        int amount = result.amount;

        assertEquals(10, amount);
    }

    @Test
    void testMultiplication()
    {
        Money five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));

    }

}