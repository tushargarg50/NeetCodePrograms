package com.tg.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
 * <p>
 * Return the length of the longest substring containing the same letter you can get after performing the above operations
 */
public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> freqMap = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            freqMap.put(s.charAt(right), freqMap.getOrDefault(s.charAt(right), 0) + 1);
            while ((right - left + 1 - freqMap.values().stream().mapToInt(Integer::intValue).max().orElse(0)) > k) {
                freqMap.put(s.charAt(left), freqMap.getOrDefault(s.charAt(left), 1) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
