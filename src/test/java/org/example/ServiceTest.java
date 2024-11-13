package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    void getNameTest()
    {
        Service service = new Service();
        String result = service.getName(-1);

        Assertions.assertEquals("a", result);
    }
}