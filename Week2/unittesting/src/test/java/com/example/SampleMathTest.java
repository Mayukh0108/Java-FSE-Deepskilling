package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SampleMathTest {

    @Test
    public void testAdd() {
        SampleMath math = new SampleMath();
        assertEquals(5, math.add(2, 3));
    }
}