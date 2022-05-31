package com.company;

import java.util.Random;

public enum WeekDays {
    MONDAY("Duyshombu"),
    TUESDAY("Sheyshembi"),
    WEDNESDAY("Sharshembi"),
    THURSDAY("Beyshembi"),
    FRIDAY("Juma"),
    SATURDAY("Ishembi"),
    SUNDAY("Jekshembi");

    private String name;

    public String getName() {return "Name of the day: " + name;}

    WeekDays(String name) {
        this.name = name;
    }

    public static WeekDays getRandomDays() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
        }
    }



