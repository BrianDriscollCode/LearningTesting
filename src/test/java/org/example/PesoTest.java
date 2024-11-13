package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PesoTest {

    @Test
    void getMultiplyAmount()
    {
        Peso peso = new Peso(10);
        int result = peso.mutiply(2);

        Assertions.assertEquals(20, result);
    }
  
}