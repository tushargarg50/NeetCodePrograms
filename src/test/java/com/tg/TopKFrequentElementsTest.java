package com.tg;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TopKFrequentElementsTest {

    @Test
    public void kFrequentElementPriorityQueue() {
        TopKFrequentElements kFrequentElements = new TopKFrequentElements();
        int[] result = kFrequentElements.kFrequentElementUsingPriorityQueue(new int[]{1,1,1,2,2,3}, 2);
        assertEquals(2, result.length);
        assertTrue(Arrays.stream(result).anyMatch(i -> i==1));
        assertTrue(Arrays.stream(result).anyMatch(i -> i==2));
        result = kFrequentElements.kFrequentElementUsingPriorityQueue(new int[]{1}, 2);
        assertEquals(1, result.length);
        assertTrue(Arrays.stream(result).anyMatch(i -> i==1));
    }

    @Test
    public void kFrequentElement() {
        TopKFrequentElements kFrequentElements = new TopKFrequentElements();
        int[] result = kFrequentElements.kFrequentElement(new int[]{1,1,1,2,2,3}, 2);
        assertEquals(2, result.length);
        assertTrue(Arrays.stream(result).anyMatch(i -> i==1));
        assertTrue(Arrays.stream(result).anyMatch(i -> i==2));
        result = kFrequentElements.kFrequentElement(new int[]{1}, 2);
        assertEquals(1, result.length);
        assertTrue(Arrays.stream(result).anyMatch(i -> i==1));
    }
}