package com.group.libraryapp.temp.fruit;

import java.time.LocalDate;

public class FruitSaveRequest {
    private String name;
    private LocalDate warehousingDate;
    private long price;

    public FruitSaveRequest(String name, LocalDate warehousingDate, long price) {
        this.name = name;
        this.warehousingDate = warehousingDate;
        this.price = price;
    }

    protected FruitSaveRequest() {}

    public String getName() {
        return name;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }

    public long getPrice() {
        return price;
    }
}
