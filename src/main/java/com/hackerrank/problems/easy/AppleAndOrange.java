package com.hackerrank.problems.easy;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
 *
 *Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.
 *
 * In the diagram below:
 *
 * The red region denotes the house, where  is the start point, and  is the endpoint. The apple tree is to the left of the house, and the orange tree is to its right.
 * Assume the trees are located on a single point, where the apple tree is at point , and the orange tree is at point .
 * When a fruit falls from its tree, it lands  units of distance from its tree of origin along the -axis. *A negative value of  means the fruit fell  units to the tree's left, and a positive value of  means it falls  units to the tree's right. *
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
