package com.mycompany.subtractiontest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.mycompany.subtraction.Subtract;

public class SubtractTest {

    @Test
    public void subtractTest() {
        Subtract obj = new Subtract();
        int result = obj.subtract(10, 5);
        assertEquals(5, result, "Subtraction failed!");
    }
}
