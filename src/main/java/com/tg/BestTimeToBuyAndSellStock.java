package com.tg;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock {

    /**
     * Time Complexity : O(n^2)
     * Space Complexity : O(1)
     */
    public int maxProfitBruteForce(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(maxProfit, Math.max(prices[j] - prices[i], 0));
            }
        }
        return maxProfit;
    }

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     * Using Sliding Window Technique : Two Pointers moving side by side symbolizing a window/Range
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0, sell = buy + 1;
        while (sell < prices.length) {
            if (prices[buy] > prices[sell]) {
                buy = sell;
            }
            maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            sell++;
        }

        return maxProfit;
    }

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     * Same as above just using foreach loop to iterate
     */
    public int maxProfitForEach(int[] prices) {
        int sell = 0;
        int buy = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < buy) {
                buy = price;
            } else {
                sell = Math.max(sell, price - buy);
            }
        }
        return sell;
    }


}
