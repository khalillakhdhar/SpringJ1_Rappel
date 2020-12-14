package com.tp.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tp.model.entity.Voiture;

public interface VoitureRepository extends CrudRepository<Voiture, Integer> {
List<Voiture> findByModel(String model);
List<Voiture> findByYear(int year);
List<Voiture>findAllByOrderByYearAsc();
}
