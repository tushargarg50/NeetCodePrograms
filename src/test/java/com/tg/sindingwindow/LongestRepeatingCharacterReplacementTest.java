package com.tg.sindingwindow;

import com.tg.slidingwindow.LongestRepeatingCharacterReplacement;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestRepeatingCharacterReplacementTest {

    @Test
    public void characterReplacement() {
        LongestRepeatingCharacterReplacement replacement = new LongestRepeatingCharacterReplacement();
        assertEquals(4, replacement.characterReplacement("ABAB", 2));
        assertEquals(4, replacement.characterReplacement("AABABBA", 1));
    }
}