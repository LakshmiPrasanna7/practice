package com.thoughtworks.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    Factorial f=new Factorial();
    @Test
    public void testForOne() throws Exception {
        assertEquals(1,f.getFactorial(1));
    }

    @Test
    public void testForTwo() throws Exception {
        assertEquals(2,f.getFactorial(2));
    }

    @Test
    public void testForThree() throws Exception {
        assertEquals(6,f.getFactorial(3));
    }

    @Test
    public void TestForFive() throws Exception {
        assertEquals(120,f.getFactorial(5));
    }
}