package de.example.mybank;

public class MyBankModell 
{
	private String name;
	private String gender;
	
	protected MyBankModell(String name, String gender)
	{
		this.name = name ;
		this.gender = gender;
	}
	
	protected String getName()
	{
		return name;
	}
	protected String getGender() 
	{
		return gender;
	}
	
	protected void setName(String name)
	{
		this.name = name;
	}
	protected void setGender(String gender)
	{
		this.gender = gender;
	}
}
