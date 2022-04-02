package com.hackerrank.problems.easy;

import java.io.*;

/**
 *
 * https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true
 */
public class DrawingBook {
    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        int dPag = p / 2;
        int dFim = n / 2;

        return Math.min(dFim - dPag, dPag);
    }

}

class DrawingBookSolution {
    public static void main(String[] args) throws IOException {

        int n = 5;

        int p = 4;

        int result = DrawingBook.pageCount(n, p);
        System.out.println(result);
    }
}

