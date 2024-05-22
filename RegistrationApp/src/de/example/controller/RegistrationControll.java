package de.example.controller;

import java.util.List;

import de.example.modell.UserModell;
import de.example.repository.UserRepository;

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

