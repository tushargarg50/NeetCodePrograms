package com.tg;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    @Test
    public void maxAreaBruteForce() {
        int[] heights = new int[] {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater maxArea = new ContainerWithMostWater();
        assertEquals(49, maxArea.maxAreaBruteForce(heights));
        heights = new int[]{1,1};
        assertEquals(1, maxArea.maxAreaBruteForce(heights));
    }

    @Test
    public void maxArea() {
        int[] heights = new int[] {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater maxArea = new ContainerWithMostWater();
        assertEquals(49, maxArea.maxArea(heights));
        heights = new int[]{1,1};
        assertEquals(1, maxArea.maxArea(heights));
    }
}