package com.tg;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestConsecutiveSequenceTest {

    @Test
    public void longestConsecutiveSequenceBruteForce() {
        int[] nums = new int[] {100,4,200,1,3,2};
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        assertEquals(4, longestConsecutiveSequence.longestConsecutiveSequenceBruteForce(nums));
        nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        assertEquals(9, longestConsecutiveSequence.longestConsecutiveSequenceBruteForce(nums));
    }

    @Test
    public void longestConsecutiveSequence() {
        int[] nums = new int[] {100,4,200,1,3,2};
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        assertEquals(4, longestConsecutiveSequence.longestConsecutiveSequence(nums));
        nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        assertEquals(9, longestConsecutiveSequence.longestConsecutiveSequence(nums));
    }
}