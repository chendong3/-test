package com.abc;

import java.util.PriorityQueue;

public class Solution {
    public int minimumDeviation(int[] nums) {
        // Priority queue to store the numbers in a max-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int min = Integer.MAX_VALUE;

        // Transform all numbers to even, and find the minimum number
        for (int num : nums) {
            if (num % 2 != 0) num *= 2;
            pq.add(num);
            min = Math.min(min, num);
        }

        int minDeviation = Integer.MAX_VALUE;

        // Reduce the maximum number until it becomes odd
        while (true) {
            int max = pq.poll();
            minDeviation = Math.min(minDeviation, max - min);

            if (max % 2 != 0) break;

            max /= 2;
            pq.add(max);
            min = Math.min(min, max);
        }

        return minDeviation;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {4, 1, 5, 20, 3};
        int[] nums3 = {2, 10, 8};
        
        System.out.println(sol.minimumDeviation(nums1)); // Output: 1
        System.out.println(sol.minimumDeviation(nums2)); // Output: 3
        System.out.println(sol.minimumDeviation(nums3)); // Output: 3
    }
}