package com.tg.twopointers;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 */
public class TrappingRainWater {

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(n)
     */
    public int rainWaterWithSpaceComplexity(int[] heights) {
        int maxRainWater = 0;
        int[] maxLeftHeights = new int[heights.length];
        int[] maxRightHeights = new int[heights.length];
        maxLeftHeights[0] = 0;
        for (int i = 1; i < heights.length; i++) {
            maxLeftHeights[i] = Math.max(maxLeftHeights[i - 1], heights[i - 1]);
        }
        maxRightHeights[heights.length - 1] = 0;
        for (int i = heights.length - 2; i >= 0; i--) {
            maxRightHeights[i] = Math.max(maxRightHeights[i + 1], heights[i + 1]);
        }
        for (int i = 0; i < heights.length; i++) {
            int minOfMaxLeftRight = Math.min(maxLeftHeights[i], maxRightHeights[i]);
            maxRainWater += Math.max(minOfMaxLeftRight - heights[i], 0);
        }
        return maxRainWater;
    }

    /**
     * Time Complexity : O(n)
     * Space complexity : O(1)
     */
    public int rainWater(int[] heights) {
        int maxRainWater = 0;
        if (heights == null || heights.length == 0) {
            return maxRainWater;
        }
        int left = 0;
        int right = heights.length - 1;
        int maxLeft = heights[left];
        int maxRight = heights[right];
        while (left < right) {
            if (maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, heights[left]);
                maxRainWater += maxLeft - heights[left];
            } else {
                right--;
                maxRight = Math.max(maxRight, heights[right]);
                maxRainWater += maxRight - heights[right];
            }
        }
        return maxRainWater;
    }

}
