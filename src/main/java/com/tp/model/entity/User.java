package com.tp.model.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank
	@Column(nullable = false)
	private String name;
	private Integer age;
	private ZonedDateTime birthDate;
	private Boolean active;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public ZonedDateTime getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(ZonedDateTime birthDate) {
		this.birthDate = birthDate;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	private User() {
	}
	private User(Integer id, @NotBlank String name, Integer age, ZonedDateTime birthDate, Boolean active) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.birthDate = birthDate;
		this.active = active;
	}
	
	
	
}
