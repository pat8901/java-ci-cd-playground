package com.mycompany.additiontest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.mycompany.addition.Add;

public class AddTest {

    @Test
    public void addTest() {
        Add obj = new Add();
        int result = obj.add(1, 7);
        assertEquals(8, result, "Test failed");
    }
}
