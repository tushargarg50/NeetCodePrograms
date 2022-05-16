package com.tg;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortedTwoSumTest {

    @Test
    public void sortedTwoSum() {
        SortedTwoSum twoSum = new SortedTwoSum();
        int[] indexes = twoSum.sortedTwoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(1, indexes[0]);
        assertEquals(2, indexes[1]);
        indexes = twoSum.sortedTwoSum(new int[]{-1,0}, -1);
        assertEquals(1, indexes[0]);
        assertEquals(2, indexes[1]);
        indexes = twoSum.sortedTwoSum(new int[]{2, 3, 4}, 6);
        assertEquals(1, indexes[0]);
        assertEquals(3, indexes[1]);
        indexes = twoSum.sortedTwoSum(new int[]{1, 3, 4, 5, 7, 10, 11}, 9);
        assertEquals(3, indexes[0]);
        assertEquals(4, indexes[1]);
    }
}