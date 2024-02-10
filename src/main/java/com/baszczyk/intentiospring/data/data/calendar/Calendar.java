package com.baszczyk.intentiospring.data.data.calendar;

import java.time.LocalDateTime;
import java.util.List;

public class Calendar {
    private LocalDateTime firstDay;
    private List<Year> years;

    public LocalDateTime getFirstDay() {
        return firstDay;
    }

    public List<Year> getYears() {
        return years;
    }

    public Calendar() {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        Year calendarYear = new Year(year);

    }
}
