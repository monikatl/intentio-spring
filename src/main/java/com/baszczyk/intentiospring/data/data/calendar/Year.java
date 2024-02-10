package com.baszczyk.intentiospring.data.data.calendar;


public class Year {
    private int name;
    private Month [] months = new Month[12];

    public Year(int name) {
        this.name = name;
        createMonthsOfYear();
    }

    private void createMonthsOfYear() {
        Months[] months = Months.values();
        for (int i = 0; i < Months.values().length; i++) {
            if(i==1){
                this.months[i] = new Month(months[i], isLeapYear());
            }
            this.months[i] = new Month(months[i]);
        }
    }



    public boolean isLeapYear() {
        return this.name / LEAP_YEAR_PREDICATE == 0;
    }

    private static final int LEAP_YEAR_PREDICATE = 4;

    // równopodzielny przez 4 przestępny
}
