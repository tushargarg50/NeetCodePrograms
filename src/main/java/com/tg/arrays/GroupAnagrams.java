package com.tg.arrays;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class GroupAnagrams {
    /**
     * Time Complexity : O(mnlogn), m is the size of input and n is the size of each word
     */
    public Collection<List<String>> groupAnagramsBruteForce(List<String> list) {
        Map<String, List<String>> sortedMap = new HashMap<>();
        for (String str : list) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            List<String> stringList = sortedMap.getOrDefault(String.valueOf(charArray), new ArrayList<>());
            stringList.add(str);
            sortedMap.put(String.valueOf(charArray), stringList);
        }
        return sortedMap.values();
    }

    /**
     * Time Complexity: O(m.n)
     */
    public Collection<List<String>> groupAnagrams(List<String> list) {
        Map<String, List<String>> sortedMap = new HashMap<>();
        for(String str: list) {
            char[] chars = new char[26];
            for(int i=0; i<str.length();i++) {
                chars[str.charAt(i)-'a']++;
            }
            List<String> strList = sortedMap.getOrDefault(String.valueOf(chars), new ArrayList<>());
            strList.add(str);
            sortedMap.put(String.valueOf(chars), strList);
        }
        return sortedMap.values();
    }

}
