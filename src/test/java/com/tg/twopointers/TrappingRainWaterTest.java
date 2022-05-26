package com.tg.twopointers;

import com.tg.twopointers.TrappingRainWater;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrappingRainWaterTest {

    @Test
    public void rainWaterWithSpaceComplexity() {
        TrappingRainWater rainWater = new TrappingRainWater();
        assertEquals(6, rainWater.rainWaterWithSpaceComplexity(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        assertEquals(9, rainWater.rainWaterWithSpaceComplexity(new int[]{4,2,0,3,2,5}));
    }

    @Test
    public void rainWater() {
        TrappingRainWater rainWater = new TrappingRainWater();
        assertEquals(6, rainWater.rainWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        assertEquals(9, rainWater.rainWater(new int[]{4,2,0,3,2,5}));
    }
}