package com.jagruti.dsa.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void testTwoSumFound() {
        TwoSum solver = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solver.twoSum(nums, target);
        // The result should be indices 0 and 1
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testTwoSumNotFound() {
        TwoSum solver = new TwoSum();
        int[] nums = {1, 2, 3};
        int target = 7;
        int[] result = solver.twoSum(nums, target);
        // The result should be {-1, -1} if no solution
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    void testTwoSumWithNegatives() {
        TwoSum solver = new TwoSum();
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] result = solver.twoSum(nums, target);
        // The result should be indices 0 and 2
        assertArrayEquals(new int[]{0, 2}, result);
    }
}
