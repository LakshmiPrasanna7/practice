package com.thoughtworks.practice;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by lakshmi on 28/6/17.
 */
public class HammingTest {
    private Hamming h=new Hamming();
    @Test
    public void checkForLengthZero() throws Exception {
        assertEquals(0,h.hammingDistance("",""));
    }

    @Test
    public void checkForLengthOne() throws Exception {
        assertEquals(1,h.hammingDistance("A","G"));
    }

    @Test
    public void checkForExample() throws Exception {
        assertEquals(7,h.hammingDistance("GAGCCTACTAACGGGAT","CATCGTAATGACGGCCT"));
    }

    @Test(expected = Exception.class)
    public void checkForUnEqualLengths() throws Exception {
        h.hammingDistance("ACC","GA");
    }
}