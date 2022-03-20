package com.hackerrank.problems.easy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true
 *
 *There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
 *
 * The elements of the first array are all factors of the integer being considered
 * The integer being considered is a factor of all elements of the second array
 * These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
 */
public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int sum = 0;
        int min = a.stream().min(Comparator.naturalOrder()).get();

        for(int i = min; i <= b.get(b.size()-1); i++){
            int m = i;
            boolean b1 = a.stream().allMatch(x -> m % x == 0);
            boolean b2 = b.stream().allMatch(x -> x % m == 0);
            if(b1 && b2){
                sum++;
            }
        }

        return sum;
    }

}

class SolutionBetweenTwoSets {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = Arrays.asList(2, 6);
        List<Integer> brr = Arrays.asList(24, 36);

//        List<Integer> arr = Arrays.asList(2, 4);
//        List<Integer> brr = Arrays.asList(16, 32, 96);

        int total = BetweenTwoSets.getTotalX(arr, brr);
        System.out.println(total);
    }
}

