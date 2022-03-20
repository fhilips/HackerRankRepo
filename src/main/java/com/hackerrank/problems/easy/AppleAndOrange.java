package com.hackerrank.problems.easy;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
 *
 *
 */
public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleSum;
        int orangeSum;

        appleSum = (int) apples.stream().filter(x -> x + a >= s && x + a <= t).count();
        orangeSum = (int) oranges.stream().filter(x -> x + b <= t && x + b >= s).count();

        System.out.println(appleSum);
        System.out.println(orangeSum);

    }

}

class AppleAndOrangeSolution {
    public static void main(String[] args) throws IOException {

        int s = 7;

        int t = 10;

        int a = 4;

        int b = 12;

        int m = 3;

        int n = 3;

        List<Integer> apples = Arrays.asList(2,3,-4);

        List<Integer> oranges =Arrays.asList(3,-2,-4);

        AppleAndOrange.countApplesAndOranges(s, t, a, b, apples, oranges);

    }
}
