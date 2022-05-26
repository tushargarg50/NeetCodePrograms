package com.tg.arrays;

import com.tg.arrays.GroupAnagrams;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    @Test
    public void groupAnagramsBruteForce() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<String> stringList = Arrays.asList("eat","tea","tan","ate","nat","bat");
        Collection<List<String>> list = groupAnagrams.groupAnagramsBruteForce(stringList);
        assertEquals(3, list.size());
    }

    @Test
    public void groupAnagrams() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<String> stringList = Arrays.asList("eat","tea","tan","ate","nat","bat");
        Collection<List<String>> list = groupAnagrams.groupAnagrams(stringList);
        assertEquals(3, list.size());
    }
}