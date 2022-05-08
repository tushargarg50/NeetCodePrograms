package com.tg;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void containsDuplicate() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = new int[] {1, 2, 3, 1};
        assertTrue(containsDuplicate.containsDuplicate(nums));
        nums = new int[] {1, 2, 3, 4};
        assertFalse(containsDuplicate.containsDuplicate(nums));
        nums = new int[] {1,1,1,3,3,4,3,2,4,2};
        assertTrue(containsDuplicate.containsDuplicate(nums));
    }
}