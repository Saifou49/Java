package de.example.registration.controller;

import java.util.List;

import de.example.registration.model.UserModell;
import de.example.registration.repository.UserRepository;

public class RegistrationControll
{
	UserRepository userRepository  = new UserRepository();
	
	public List<UserModell>  userList;

	public boolean registration(UserModell userModell) 
	{
		boolean save = userRepository.save(userModell);
		return save;
	}
	
	public List<UserModell> listUsers() 
	{
		userList = userRepository.listAll();
		return userList;
	}
	
}

