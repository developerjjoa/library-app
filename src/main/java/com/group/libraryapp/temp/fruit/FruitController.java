package com.group.libraryapp.temp.fruit;

import org.springframework.web.bind.annotation.*;

@RestController
public class FruitController {

    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/api/v1/fruit")
    public void saveFruit(@RequestBody FruitSaveRequest request) {
        fruitService.saveFruit(request);
    }

    @PutMapping("/api/v1/fruit")
    public void sellFruit(@RequestBody FruitSellRequest request) {
        fruitService.sellFruit(request);
    }

    @GetMapping("/api/v1/fruit/stat")
    public FruitStatResponse getFruitStat(@RequestParam String name) {
        return fruitService.getFruitStat(name);
    }
}
