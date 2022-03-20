package com.hackerrank.problems.easy;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true
 *
 * Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
 *
 * Lily decides to share a contiguous segment of the bar selected such that:
 *
 * The length of the segment matches Ron's birth month, and,
 * The sum of the integers on the squares is equal to his birth day.
 * Determine how many ways she can divide the chocolate.
 */
public class TheBirthdayBar {
    public static int birthday(List<Integer> s, int d, int m) {

        int sum = 0;

        for(int i = 0; i <= s.size() - m; i++){
            int pSum = 0;
            for(int j = i; j < i + m; j++){
                pSum += s.get(j);
            }
            if(pSum == d) {
                sum++;
            }
        }

        return sum;
    }

}

class SolutionTheBirthdayBar {
    public static void main(String[] args) throws IOException {


        List<Integer> s = Arrays.asList(1, 2, 1, 3, 2);

        int d = 3;

        int m = 2;

        int result = TheBirthdayBar.birthday(s, d, m);

        System.out.println(result);
    }

}
