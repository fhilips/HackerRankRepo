package com.hackerrank.problems.easy;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of integers, find the sum of its elements.
 */
public class SimpleArraySum {
    public static void main(String[] args) throws IOException {
        List<Integer> intList = Arrays.asList(1,2,3,4,5);

        int arraySum = Solution.sum(intList);
        System.out.println(arraySum);
    }

}

class Solution {
    public static int sum(List<Integer> ar) {
        // Write your code here
        return ar.stream().mapToInt(x -> x).sum();
    }
}
