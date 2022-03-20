package com.hackerrank.problems;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 *
 */
public class TimeConversion {

    public static void main(String[] args) throws ParseException {

    String twelveHoursTime = "12:01:00AM";

    Result.timeConversion(twelveHoursTime); // 00:01:00

    }

}

class Result {

    public static String timeConversion(String s) throws ParseException {

        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");

        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
        Date date;

        date = df.parse(s);

        String output = outputformat.format(date);
        System.out.println(output);

        return output;
    }

}
