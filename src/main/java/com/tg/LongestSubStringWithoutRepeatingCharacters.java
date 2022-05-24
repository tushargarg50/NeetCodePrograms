package com.tg;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubStringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        Set<Character> characterSet = new HashSet<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (characterSet.contains(s.charAt(right))) {
                characterSet.remove(s.charAt(left));
                left++;
            }
            characterSet.add(s.charAt(right));
            result = Math.max(result, right - left + 1);
        }

        return result;
    }

}
