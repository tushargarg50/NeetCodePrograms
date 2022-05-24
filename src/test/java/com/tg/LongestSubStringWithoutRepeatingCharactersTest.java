package com.tg;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubStringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubStringWithoutRepeatingCharacters lengthOfSubstring = new LongestSubStringWithoutRepeatingCharacters();
        assertEquals(3, lengthOfSubstring.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, lengthOfSubstring.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, lengthOfSubstring.lengthOfLongestSubstring("pwwkew"));
    }
}