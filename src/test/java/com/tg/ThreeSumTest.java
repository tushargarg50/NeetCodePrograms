package com.tg;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumTest {

    @Test
    public void threeSumWithoutSorting() {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result =  threeSum.threeSumWithoutSorting(Arrays.asList(-1,0,1,2,-1,-4));
        assertEquals(2, result.size());
        result =  threeSum.threeSumWithoutSorting(Collections.emptyList());
        assertEquals(0, result.size());
        result =  threeSum.threeSumWithoutSorting(Arrays.asList(0));
        assertEquals(0, result.size());

    }

    @Test
    public void threeSumWithSorting() {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result =  threeSum.threeSumWithSorting(Arrays.asList(-1,0,1,2,-1,-4));
        assertEquals(2, result.size());
        result =  threeSum.threeSumWithSorting(Collections.emptyList());
        assertEquals(0, result.size());
        result =  threeSum.threeSumWithSorting(Arrays.asList(0));
        assertEquals(0, result.size());

    }
}