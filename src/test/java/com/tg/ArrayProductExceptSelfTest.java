package com.tg;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayProductExceptSelfTest {

    @Test
    public void arrayProductExceptSelfWithoutDivision() {

        ArrayProductExceptSelf arrayProductExceptSelf = new ArrayProductExceptSelf();
        int[] result = arrayProductExceptSelf.arrayProductExceptSelfWithoutDivision(new int[]{1, 2, 3, 4});
        assertEquals(4, result.length);
        int i = 0;
        assertEquals(24, result[i++]);
        assertEquals(12, result[i++]);
        assertEquals(8, result[i++]);
        assertEquals(6, result[i]);

    }

    @Test
    public void arrayProductExceptSelfWithDivision() {

        ArrayProductExceptSelf arrayProductExceptSelf = new ArrayProductExceptSelf();
        int[] result = arrayProductExceptSelf.arrayProductExceptSelfWithDivision(new int[]{1, 2, 3, 4});
        assertEquals(4, result.length);
        int i = 0;
        assertEquals(24, result[i++]);
        assertEquals(12, result[i++]);
        assertEquals(8, result[i++]);
        assertEquals(6, result[i]);

    }

    @Test
    public void arrayProductExceptSelfBruteForce() {

        ArrayProductExceptSelf arrayProductExceptSelf = new ArrayProductExceptSelf();
        int[] result = arrayProductExceptSelf.arrayProductExceptSelfBruteForce(new int[]{1, 2, 3, 4});
        assertEquals(4, result.length);
        int i = 0;
        assertEquals(24, result[i++]);
        assertEquals(12, result[i++]);
        assertEquals(8, result[i++]);
        assertEquals(6, result[i]);

    }
}