package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static List<LocalDate> printBonusDatesBetween(int fromYear, int toYear) {

        //part 1 initialize dates
        LocalDate startDate = LocalDate.of(fromYear, 1, 1);
        LocalDate endDate = LocalDate.of(toYear, 12, 31);
        System.out.println(startDate + " " + endDate);


        //part 2 returns all dates between two dates
        List<LocalDate> totalDates = new ArrayList<>();
        while (!startDate.isAfter(endDate)) {
            String tempDate = startDate.toString();
            String reversedDate = tempDate.substring(9,10) + tempDate.substring(8,9) + tempDate.substring(6,7) + tempDate.substring(5,6);
            if (tempDate.substring(0, 4).equals(reversedDate)) {
                totalDates.add(startDate);
            }
            startDate = startDate.plusDays(1);
       }
        System.out.println(totalDates);
        return totalDates;
    }

}
