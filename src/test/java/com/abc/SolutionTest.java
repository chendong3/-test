package com.abc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testMinimumDeviation() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {4, 1, 5, 20, 3};
        int[] nums3 = {2, 10, 8};
        int[] nums4 = {1, 3, 5, 7, 9};
        int[] nums5 = {2, 4, 6, 8, 10};

        assertEquals(1, solution.minimumDeviation(nums1));
        assertEquals(3, solution.minimumDeviation(nums2));
        assertEquals(3, solution.minimumDeviation(nums3));
        assertEquals(7, solution.minimumDeviation(nums4));
        assertEquals(3, solution.minimumDeviation(nums5));
    }
}



