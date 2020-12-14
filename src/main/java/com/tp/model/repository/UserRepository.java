package com.tp.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tp.model.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	List<User> findByName(String name);
	User findDISTINCTByName(String name);
	List<User> findByBirthDateIsNull();
	List<User> findByActiveTrue(); 
	List<User> findByActiveFalse();

}
