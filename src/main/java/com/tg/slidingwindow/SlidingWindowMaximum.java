package com.tg.slidingwindow;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 * <p>
 * Return the max sliding window.
 */
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null) {
            return nums;
        }
        int n = nums.length;

        // Base case
        if (n == 0 || k == 0) {
            return new int[0];
        }

        int[] result = new int[n - k + 1];

        // Deque will store indices
        Deque<Integer> deque = new ArrayDeque<>();

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < n; windowEnd++) {
            // pop out smaller values from deque
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[windowEnd]) {
                deque.removeLast();
            }

            deque.add(windowEnd);
            // remove left value from window
            if (windowStart > deque.getFirst()) {
                deque.removeFirst();
            }

            if (windowEnd - windowStart + 1 >= k) {
                result[windowStart++] = nums[deque.getFirst()];
            }
        }
        return result;
    }
}
