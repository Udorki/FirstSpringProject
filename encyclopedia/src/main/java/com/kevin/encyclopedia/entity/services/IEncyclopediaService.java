package com.kevin.encyclopedia.entity.services;

import java.util.List;

import com.kevin.encyclopedia.entity.models.Animal;

public interface IEncyclopediaService {

	public Animal findById(long id);
	public List<Animal> findAll();
	public List<Animal> findByClassification(String classification);
	public void create(Animal animal);
	public void deleteById(long id);
	public void update(Animal animal, long id);
}
