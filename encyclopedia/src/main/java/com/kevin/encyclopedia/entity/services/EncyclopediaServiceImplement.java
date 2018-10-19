package com.kevin.encyclopedia.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.encyclopedia.entity.dao.IEncyclopediaDao;
import com.kevin.encyclopedia.entity.models.Animal;

@Service
public class EncyclopediaServiceImplement implements IEncyclopediaService{

	@Autowired
	private IEncyclopediaDao encyclopediaDao;
	
	@Override
	public Animal findById(long id) {
		return encyclopediaDao.findById(id).get();
	}
	
	@Override
	public List<Animal> findAll(){
		return (List<Animal>) encyclopediaDao.findAll();
	}
	
	@Override
	public List<Animal> findByClassification(String classification){
		return (List<Animal>) encyclopediaDao.findByClassification(classification);
	}
	
	@Override
	public void create(Animal animal) {
		encyclopediaDao.save(animal);
	}
	
	@Override
	public void deleteById(long id) {
		encyclopediaDao.deleteById(id);
	}
	
	@Override
	public void update(Animal animal, long id) {
		encyclopediaDao.findById(id).ifPresent((x)->{
			animal.setId(id);
			encyclopediaDao.save(animal);
		});
	}
}
