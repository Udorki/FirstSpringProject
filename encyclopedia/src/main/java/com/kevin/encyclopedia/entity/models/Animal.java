package com.kevin.encyclopedia.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "animals")
@CrossOrigin(origins = {"http://192.168.201.84:8100","*"})
public class Animal implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String weight;
	
	@NotEmpty
	private String measure;
	
	@NotEmpty
	private String average_age;
	
	@NotEmpty
	private String classification;
	
	@NotEmpty
	private String classes;
	
	@NotEmpty
	private String family;
	
	@NotEmpty
	private String genus;
	
	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getWeight() {
		return weight;
	}



	public void setWeight(String weight) {
		this.weight = weight;
	}



	public String getMeasure() {
		return measure;
	}



	public void setMeasure(String measure) {
		this.measure = measure;
	}



	public String getAverage_age() {
		return average_age;
	}



	public void setAverage_age(String average_age) {
		this.average_age = average_age;
	}



	public String getClassification() {
		return classification;
	}



	public void setClassification(String classification) {
		this.classification = classification;
	}



	public String getClasses() {
		return classes;
	}



	public void setClasses(String classes) {
		this.classes = classes;
	}



	public String getFamily() {
		return family;
	}



	public void setFamily(String family) {
		this.family = family;
	}



	public String getGenus() {
		return genus;
	}



	public void setGenus(String genus) {
		this.genus = genus;
	}

	public Animal(long id, @NotEmpty String name, @NotEmpty String weight, @NotEmpty String measure,
			@NotEmpty String average_age, @NotEmpty String classification, @NotEmpty String classes,
			@NotEmpty String family, @NotEmpty String genus) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.measure = measure;
		this.average_age = average_age;
		this.classification = classification;
		this.classes = classes;
		this.family = family;
		this.genus = genus;
	}

	public Animal() {
		super();
	}
	
	
}
