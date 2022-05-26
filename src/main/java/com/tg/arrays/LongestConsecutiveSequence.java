package com.tg.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * <p>
 * You must write an algorithm that runs in O(n) time.
 */
public class LongestConsecutiveSequence {

    /**
     * Time Complexity : O(nlogn)
     */
    public int longestConsecutiveSequenceBruteForce(int[] nums) {
        Arrays.sort(nums);
        int maxLength = 0;
        int length = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                length++;
            } else {
                length = 1;
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(n)
     */
    public int longestConsecutiveSequence(int[] nums) {
        int maxLength = 0;
        Set<Integer> integerSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for (int i : integerSet) {
            if (!integerSet.contains(i - 1)) {
                int length = 1;
                while (integerSet.contains(i + length)) {
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }

}
