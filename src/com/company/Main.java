package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        WeekDays day = WeekDays.getRandomDays();
        System.out.println("Random days");
        System.out.println(day.getName());
        switch (day) {
            case MONDAY -> System.out.println("Duyshombu kunu men java okuym");

            case TUESDAY -> System.out.println("Sheyshembi kunu men anglis tilin okuym");

            case WEDNESDAY -> System.out.println("Sharshembi kunu men java okuym");

            case THURSDAY -> System.out.println("Beyshembi kunu men soft skills okuym");

            case FRIDAY -> System.out.println("Juma kunu men java okuym");

            case SATURDAY -> System.out.println("Ishembi kunu mende sabak bolboyt");

            case SUNDAY -> System.out.println("Jekshembi kunu mende sabak bolboyt");
        }
    }
}

