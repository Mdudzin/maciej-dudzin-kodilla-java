package com.kodilla.stream.portfolio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class testowaklasa {

    public static void main (String[] args) {

        LocalDate pastDay = LocalDate.of(2017, 9, 14);

        long wynik = pastDay.until(LocalDate.now(), ChronoUnit.DAYS);

        System.out.println(wynik);
    }
}