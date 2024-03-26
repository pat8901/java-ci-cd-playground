package com.mycompany.helloworldtest;

import org.junit.jupiter.api.Test;
import com.mycompany.helloworld.HelloWorld;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void setMessageTest() {
        HelloWorld obj = new HelloWorld();
        String message = obj.getMessage();
        assertEquals(message, "Welcome to the program!");
    }
}
