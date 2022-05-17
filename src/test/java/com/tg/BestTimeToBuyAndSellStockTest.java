package com.tg;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfitBruteForce() {
        BestTimeToBuyAndSellStock maxProfit = new BestTimeToBuyAndSellStock();
        assertEquals(5, maxProfit.maxProfitBruteForce(new int[]{7,1,5,3,6,4}));
        assertEquals(0, maxProfit.maxProfitBruteForce(new int[] {7,6,4,3,1}));
    }

    @Test
    public void maxProfit() {
        BestTimeToBuyAndSellStock maxProfit = new BestTimeToBuyAndSellStock();
        assertEquals(5, maxProfit.maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(0, maxProfit.maxProfit(new int[] {7,6,4,3,1}));
    }

    @Test
    public void maxProfitForEach() {
        BestTimeToBuyAndSellStock maxProfit = new BestTimeToBuyAndSellStock();
        assertEquals(5, maxProfit.maxProfitForEach(new int[]{7,1,5,3,6,4}));
        assertEquals(0, maxProfit.maxProfitForEach(new int[] {7,6,4,3,1}));
    }
}