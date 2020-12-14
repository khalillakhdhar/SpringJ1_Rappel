package com.tp.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Voiture {
@Id
private Integer id;
@NotNull 
private String Model;
private int year;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}




}
