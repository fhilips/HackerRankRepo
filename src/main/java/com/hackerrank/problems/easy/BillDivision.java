package com.hackerrank.problems.easy;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 *
 * https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
 */
public class BillDivision {
    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = bill.stream()
                .mapToInt(x -> x)
                .sum();
        sum = sum - bill.get(k);
        if(sum / 2 == b)
            System.out.println("Bon Appetit");
        else
            System.out.println(Math.abs(b - (sum / 2)));
    }

}

class SolutionBillDivision {
    public static void main(String[] args) throws IOException {

        int k = 1;
        int b = 12;

        List<Integer> bill = Arrays.asList(3, 10, 2, 9);

        BillDivision.bonAppetit(bill, k, b);

    }
}