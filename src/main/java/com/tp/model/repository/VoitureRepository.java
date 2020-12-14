package com.tp.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.tp.model.entity.Voiture;

public interface VoitureRepository extends CrudRepository<Voiture, Integer> {

}
