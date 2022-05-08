package com.tg;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void isAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
        assertFalse(validAnagram.isAnagram("rat","car"));

    }

    @Test
    public void isAnagramusingSorting() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertTrue(validAnagram.isAnagramUsingSorting("anagram", "nagaram"));
        assertFalse(validAnagram.isAnagramUsingSorting("rat","car"));

    }
}