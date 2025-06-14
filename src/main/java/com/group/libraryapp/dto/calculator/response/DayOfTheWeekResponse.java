package com.group.libraryapp.dto.calculator.response;

public class DayOfTheWeekResponse {
    private String dayOfTheWeek;

    public DayOfTheWeekResponse(String dayOfWeek) {
        this.dayOfTheWeek = dayOfWeek;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }
}
