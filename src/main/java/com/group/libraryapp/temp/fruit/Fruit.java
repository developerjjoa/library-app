package com.group.libraryapp.temp.fruit;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    private String name;
    private LocalDate warehousingDate;
    private long price;
    @Column(name = "is_sell")
    private boolean isSell = false;

    protected Fruit() {}

    public Fruit(String name, LocalDate warehousingDate, long price) {
        this.name = name;
        this.warehousingDate = warehousingDate;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }

    public long getPrice() {
        return price;
    }

    public boolean isSell() {
        return isSell;
    }

    public void sell() {
        isSell = true;
    }
}
