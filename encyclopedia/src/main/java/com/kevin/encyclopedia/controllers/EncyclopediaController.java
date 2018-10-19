package com.kevin.encyclopedia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevin.encyclopedia.entity.models.Animal;
import com.kevin.encyclopedia.entity.services.IEncyclopediaService;

@CrossOrigin(origins = {"*","http://localhost:3456"})
@RestController
public class EncyclopediaController {

	@Autowired
	private IEncyclopediaService encyclopediaService;
	
	@GetMapping("/animals")
	public List<Animal> findAll() {
		return encyclopediaService.findAll();
	}
	
	@GetMapping("/animal/{id}")
	public Animal findById(@PathVariable(value = "id") long id) {
		return encyclopediaService.findById(id);
	}
	
	@GetMapping("/animalClas/{classification}")
	public List<Animal> findByClassification(@PathVariable(value = "classification") String classification){
		return encyclopediaService.findByClassification(classification);
	}
	
	@PostMapping("/animalPos")
	public void create(Animal animal) {
		encyclopediaService.create(animal);
	}
	
	@PutMapping("/animalPut/{id}")
	public void update(Animal animal, @PathVariable(value = "id") long id) {
		encyclopediaService.update(animal, id);
	}
	
	@DeleteMapping("/animalDel/{id}")
	public void delete(Animal animal, @PathVariable(value = "id") long id) {
		encyclopediaService.deleteById(id);
	}
}
