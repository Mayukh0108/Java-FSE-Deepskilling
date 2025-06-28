package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrangeActAssertTest {

    private SampleMath math;

    @Before
    public void setUp() {
        math = new SampleMath();
        System.out.println("Setup completed");
    }

    @After
    public void tearDown() {
        math = null;
        System.out.println("Teardown completed");
    }

    @Test
    public void testAddition() {
        int a = 8;
        int b = 7;

        int result = math.add(a, b);

        assertEquals(15, result);
    }

    @Test
    public void testMultiplication() {
   
        int a = 4;
        int b = 5;

      
        int result = math.multiply(a, b);

        assertEquals(20, result);
    }
}
