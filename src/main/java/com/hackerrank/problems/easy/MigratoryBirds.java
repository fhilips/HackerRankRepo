package com.hackerrank.problems.easy;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Given an array of bird sightings where every element represents a bird type id, determine the id of the most
 * frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
 * https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true
 */
public class MigratoryBirds {
        /*
         * Complete the 'migratoryBirds' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
            Map<Integer, Long> collect = arr.stream()
                    .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

            return collect.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        }
}

class SolutionMigratoryBirds {
    public static void main(String[] args) throws IOException {

        int arrCount = 6;

        List<Integer> arr = Arrays.asList(1, 4, 4, 4, 5, 3);

        int result = MigratoryBirds.migratoryBirds(arr);

        System.out.println(result);
    }
}
