package com.group.libraryapp.temp.fruit;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FruitService {

    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Transactional
    public void saveFruit(FruitSaveRequest request) {
        fruitRepository.save(new Fruit(request.getName(), request.getWarehousingDate(), request.getPrice()));
    }

    @Transactional
    public void sellFruit(FruitSellRequest request) {
        Fruit fruit = fruitRepository.findById(request.getId()).
                orElseThrow(() -> new IllegalArgumentException("Fruit not found" + request.getId()));
        fruit.sell();
        fruitRepository.save(fruit);
    }

    @Transactional(readOnly = true)
    public FruitStatResponse getFruitStat(String name) {
        List<Fruit> fruits = fruitRepository.findAllByName(name);

        long salesAmount = fruits.stream()
                .filter(Fruit::isSell)
                .mapToLong(Fruit::getPrice)
                .sum();

        long notSalesAmount = fruits.stream()
                .filter(fruit -> !fruit.isSell())
                .mapToLong(Fruit::getPrice)
                .sum();

        return new FruitStatResponse(salesAmount, notSalesAmount);
    }
}
