package com.tg;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void isValidPalindromeBruteForce() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        assertTrue(validPalindrome.isValidPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(validPalindrome.isValidPalindrome("race a car"));
        assertTrue(validPalindrome.isValidPalindrome(" "));
    }
}