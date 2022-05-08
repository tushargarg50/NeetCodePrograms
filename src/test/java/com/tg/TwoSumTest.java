package com.tg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TwoSumTest {

    @Test
    public void twoSumBruteForce() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSumBruteForce(numbers, target);
        assertNotNull(result);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        numbers = new int[]{3, 2, 4};
        target = 6;
        result = twoSum.twoSumBruteForce(numbers, target);
        assertNotNull(result);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        numbers = new int[]{3, 3};
        result = twoSum.twoSumBruteForce(numbers, target);
        assertNotNull(result);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);

    }

    @Test
    public void twoSum() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(numbers, target);
        assertNotNull(result);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
        numbers = new int[]{3, 2, 4};
        target = 6;
        result = twoSum.twoSum(numbers, target);
        assertNotNull(result);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        numbers = new int[]{3, 3};
        result = twoSum.twoSum(numbers, target);
        assertNotNull(result);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}