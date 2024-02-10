package com.baszczyk.intentiospring.data.data.calendar;

public class Month {

    private Months name;
    private Day [] days;

    public Month(Months month) {
        this.name = month;
        this.days = new Day[month.getNumOfDays()];
    }

    public Month(Months month, boolean isLeapYear) {
        this.name = month;
        if(isLeapYear){
            this.days = new Day[Months.FEBRUARY_LEAP_YEAR];
        } else {
            this.days = new Day[month.getNumOfDays()];
        }
    }


}
