package com.baszczyk.intentiospring.data.data.calendar;

public enum Months {

    JANUARY("Styczeń", 31),
    FEBRUARY("Luty", 28),
    MARCH("Marzec", 31),
    APRIL("Kwiecień", 30),
    MAY("Maj", 31),
    JUNE("Czerwiec", 30),
    JULY("Lipiec", 31),
    AUGUST("Sierpień", 31),
    SEPTEMBER("Kwiecień", 30),
    OCTOBER("Kwiecień", 31),
    NOVEMBER("Listopad", 30),
    DECEMBER("Grudzień", 31);

    private String name;

    public int getNumOfDays() {
        return numOfDays;
    }

    private int numOfDays;


    Months(String name, int numOfDays) {
        this.name = name;
        this.numOfDays = numOfDays;
    }

    public static final int FEBRUARY_LEAP_YEAR = 29;

}
