package com.karumi.katasuperheroes;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UnitTestExample {

    @Test
    public void successfulTest() throws Exception {
        assertTrue(2 + 2 == 4);
    }

    @Test
    public void failingTest() throws Exception {
        assertTrue(2 + 2 == 5);
    }
}