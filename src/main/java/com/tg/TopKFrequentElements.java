package com.tg;

import java.util.*;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 */
public class TopKFrequentElements {

    public int[] kFrequentElementUsingPriorityQueue(int[] input, int k) {
        int[] result = new int[k];
        if (k >= input.length) return input;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : input) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        queue.addAll(frequencyMap.entrySet());
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll().getKey();
        }
        return result;
    }

    public int[] kFrequentElement(int[] input, int k) {
        int[] result = new int[k];
        if (k >= input.length) return input;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : input) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }
        NavigableMap<Integer, List<Integer>> sortedMap = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            List<Integer> nums = sortedMap.getOrDefault(entry.getValue(), new ArrayList<>());
            nums.add(entry.getKey());
            sortedMap.put(entry.getValue(), nums);
        }
        int j = 0;
        while (j < k) {
            Map.Entry<Integer, List<Integer>> polledList = sortedMap.pollLastEntry();
            for (Integer integer : polledList.getValue()) {
                result[j++] = integer;
                if (j == k) break;
            }
        }

        return result;
    }
}
