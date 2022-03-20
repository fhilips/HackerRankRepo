package com.hackerrank.problems.easy;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int count = 0;

        for(int i =0; i < n-1; i++) {
            for(int j = i+1; j < n; j++){
                int sum = ar.get(i) + ar.get(j);
                if(sum % k == 0){
                    count++;
                }
            }
        }

        return count;
    }

}

class SolutionDivisibleSumPairs {
    public static void main(String[] args) throws IOException {

        int n = 6;

        int k = 3;

        List<Integer> ar = Arrays.asList(1, 3, 2, 6, 1, 2);

        int result = DivisibleSumPairs.divisibleSumPairs(n, k, ar);

        System.out.println(result);
    }
}
