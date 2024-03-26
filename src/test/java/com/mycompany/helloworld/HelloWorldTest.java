package com.mycompany.helloworld;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void addTest() {
        System.out.println("Testing add using junit");

        HelloWorld obj = new HelloWorld();
        int result = obj.add(2, 6);

        assertEquals(8, result, "Test failed");
    }

}
