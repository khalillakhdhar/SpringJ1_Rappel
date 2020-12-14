package com.tp.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.model.entity.Voiture;

@RestController
@RequestMapping("car")
public class VoitureController {
@Autowired
VoitureService vs;

@PostMapping
public Voiture savevt(@Valid @RequestBody Voiture voiture)
{
	
return vs.ajouter(voiture);

}
@GetMapping
public List<Voiture> affichage()
{
	return vs.lister();


}
}
