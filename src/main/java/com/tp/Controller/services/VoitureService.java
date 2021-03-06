package com.tp.Controller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.model.entity.Voiture;
import com.tp.model.repository.VoitureRepository;

@Service
public class VoitureService {
@Autowired VoitureRepository vr;
public Voiture ajouter(Voiture v)
{
return 	vr.save(v);

}
public List<Voiture> lister()
{
	return (List<Voiture>) vr.findAll();

}
public List<Voiture> listerorder()
{
	return (List<Voiture>) vr.findAllByOrderByYearAsc();

}
public List<Voiture> listeModel(String model)
{
	
return (List<Voiture>) vr.findByModel(model);
}
public List<Voiture> listeYeay(int year)
{
return (List<Voiture>) vr.findByYear(year);	

}
}
