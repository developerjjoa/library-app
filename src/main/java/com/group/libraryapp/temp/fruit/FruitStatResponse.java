package com.group.libraryapp.temp.fruit;

public class FruitStatResponse {
    private long salesAmount;
    private long notSaleAmount;

    public FruitStatResponse(long salesAmount, long notSaleAmount) {
        this.salesAmount = salesAmount;
        this.notSaleAmount = notSaleAmount;
    }

    public long getSalesAmount() {
        return salesAmount;
    }

    public long getNotSaleAmount() {
        return notSaleAmount;
    }
}
