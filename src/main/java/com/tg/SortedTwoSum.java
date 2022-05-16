package com.tg;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * <p>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * <p>
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * <p>
 * Your solution must use only constant extra space.
 */
public class SortedTwoSum {

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public int[] sortedTwoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while(i<j && nums[i]+nums[j] > target) {
                j--;
            }
            while(i<j && nums[i]+nums[j] < target) {
                i++;
            }
            if(nums[i]+nums[j] == target) {
                result[0] = i+1;
                result[1] = j+1;
            }
            i++;
            j--;
        }
        return result;
    }

}
