package com.tg;

import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class ArrayProductExceptSelf {

    /**
     * Time Complexity : O(n)
     */
    public int[] arrayProductExceptSelfWithoutDivision(int[] input) {
        int[] result = new int[input.length];
        Arrays.fill(result, 1);
        int postfixProduct = 1;
        for (int i = 0; i < input.length; i++) {
            if (i != input.length - 1)
                result[i + 1] = result[i] * input[i];
        }
        for (int i = input.length - 1; i >= 0; i--) {
            postfixProduct *= input[i];
            if (i != 0)
                result[i - 1] = result[i - 1] * postfixProduct;
        }
        return result;
    }

    /**
     * Time Complexity : O(n)
     */
    public int[] arrayProductExceptSelfWithDivision(int[] input) {
        int product = 1;
        int[] result = new int[input.length];
        for (int i: input) {
            product *= i;
        }
        for (int i = 0; i < input.length; i++) {
            result[i] = product / input[i];
        }
        return result;
    }

    /**
     * Time Complexity: O(n^2)
     */
    public int[] arrayProductExceptSelfBruteForce(int[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = calculateTotal(input, i);
        }
        return result;
    }

    private int calculateTotal(int[] input, int i) {
        int product = 1;
        for (int j = 0; j < input.length; j++) {
            if (i == j) continue;
            product *= input[j];
        }
        return product;
    }

}
