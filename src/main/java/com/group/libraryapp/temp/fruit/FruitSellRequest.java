package com.group.libraryapp.temp.fruit;

public class FruitSellRequest {
    private long id;

    public FruitSellRequest(long id) {
        this.id = id;
    }

    protected FruitSellRequest() {}

    public long getId() {
        return id;
    }
}
