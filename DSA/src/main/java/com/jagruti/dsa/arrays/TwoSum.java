package com.jagruti.dsa.arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] numbs, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbs.length; i++) {
            int complement = target - numbs[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(numbs[i], i);
        }
        return new int[]{-1, -1}; // if no solution
    }
}

