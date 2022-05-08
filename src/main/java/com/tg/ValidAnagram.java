package com.tg;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            frequencyMap.put(s.charAt(i), frequencyMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (!frequencyMap.containsKey(t.charAt(i))) {
                return false;
            }
            frequencyMap.put(t.charAt(i), frequencyMap.get(t.charAt(i)) - 1);
        }
        return frequencyMap.values().stream().noneMatch(i -> i != 0);
    }

    public boolean isAnagramUsingSorting(String s, String t) {
        char[] charArray = s.toCharArray();
        char[] chars = t.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(chars);
        return String.valueOf(charArray).equals(String.valueOf(chars));
    }

}
