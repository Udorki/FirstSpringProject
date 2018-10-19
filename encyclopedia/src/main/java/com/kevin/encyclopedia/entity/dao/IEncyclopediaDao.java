package com.kevin.encyclopedia.entity.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kevin.encyclopedia.entity.models.Animal;

public interface IEncyclopediaDao extends CrudRepository<Animal, Long>{

	List<Animal> findByClassification(String classification);
}
