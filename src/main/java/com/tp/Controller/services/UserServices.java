package com.tp.Controller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.model.entity.User;
import com.tp.model.repository.UserRepository;

@Service
public class UserServices {
@Autowired
UserRepository ur;
public List<User>  findusername(String name)
{
	//return ur.find
return (List<User>)  ur.findByName(name);
}
public List<User> finduserordered(String name)
{
	
return (List<User>) ur.findByNameOrderByNameDesc(name);
}


}
