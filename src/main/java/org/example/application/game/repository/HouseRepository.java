package org.example.application.game.repository;

import org.example.application.housing.model.House;

import java.util.List;

public interface HouseRepository {
    House save(House house);

    List<House> findAll();

    House delete(House house);

}
