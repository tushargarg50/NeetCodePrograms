package com.tg;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSum {

    /**
     * Time Complexity : O(n^2)
     * Space Complexity : O(n)
     */
    public List<List<Integer>> threeSumWithoutSorting(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        TwoSum twoSum = new TwoSum();
        Set<Integer> visitedInts = new HashSet<>();
        for (int i = 0; i < nums.size() - 2; i++) {
            if (!visitedInts.contains(nums.get(i))) {
                int[] twoSumResult = twoSum.twoSum(nums.subList(i + 1, nums.size() - 1).stream().mapToInt(Integer::intValue).toArray(), nums.get(i) * -1);
                if (twoSumResult != null) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums.get(i));
                    subList.add(twoSumResult[0]);
                    subList.add(twoSumResult[1]);
                    result.add(subList);
                }
                visitedInts.add(nums.get(i));
            }
        }
        return result;
    }

    /**
     * Time Complexity : O(n^2)
     * Space Complexity : O(1)
     */
    public List<List<Integer>> threeSumWithSorting(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        SortedTwoSum twoSum = new SortedTwoSum();
        Collections.sort(nums);
        for (int i = 0; i < nums.size() - 2; i++) {
            if (i == 0 || nums.get(i).equals(nums.get(i - 1))) {
                int[] twoSumResult = twoSum.sortedTwoSum(nums.subList(i + 1, nums.size() - 1).stream().mapToInt(Integer::intValue).toArray(), nums.get(i) * -1);
                if (twoSumResult != null) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums.get(i));
                    subList.add(twoSumResult[0]);
                    subList.add(twoSumResult[1]);
                    result.add(subList);
                }
            }
        }
        return result;
    }
}
