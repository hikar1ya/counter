package ru.ac.uniyar.testingcourse;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void testConstructor() {
        Counter ctr = new Counter();
        assertEquals(0, ctr.getValue());
    }

    @Test
    public void testReset() {
        Counter ctr = new Counter();
        ctr.reset();
        assertEquals(0, ctr.getValue());
    }

}
