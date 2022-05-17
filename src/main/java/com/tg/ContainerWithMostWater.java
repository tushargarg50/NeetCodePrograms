package com.tg;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * <p>
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * <p>
 * Return the maximum amount of water a container can store.
 * <p>
 * Notice that you may not slant the container.
 */
public class ContainerWithMostWater {

    /**
     * Time Complexity : O(n^2)
     */
    public int maxAreaBruteForce(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return maxArea;
    }

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            maxArea = Math.max(maxArea, (j - i) * Math.min(height[j], height[i]));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }

}
