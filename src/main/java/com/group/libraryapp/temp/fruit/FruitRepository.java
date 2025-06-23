package com.group.libraryapp.temp.fruit;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FruitRepository extends JpaRepository<Fruit, Long> {
    Optional<Fruit> findById(long id);
    List<Fruit> findAllByName(String name);
}
