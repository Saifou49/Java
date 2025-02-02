package de.example.registration.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import de.example.registration.model.UserModell;

public class UserRepository {
	
	List<UserModell> userList;
	
	//The fake database
	private Map<String ,UserModell> userMap = new HashMap <>() ;
	
	
	public  boolean save(UserModell userModell) 
	{
		
		
		if(checkIfUserExit(userModell))
		{
			return false;
		}
		
		userMap.put(userModell.getEmail(), userModell);
		
		
		return true;
	}
	
	public boolean checkIfUserExit(UserModell userModell) 
	{
		UserModell userModell2 = userMap.get(userModell.getEmail());
		
		if(userModell2 == null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public List<UserModell> listAll()
	{
		userList = new ArrayList<>();
		for(Map.Entry<String ,UserModell> userMapLoop : userMap.entrySet()) 
		{
			userList.add(userMapLoop.getValue());
			
			System.out.println("Id = " + userMapLoop.getKey() + " - value = " + userMapLoop.getValue());
		} 
		
		return userList;
	}
}

/*
 * catch the error when you put a string in the field age
 */

