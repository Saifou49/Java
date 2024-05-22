package de.example.game;

public class GameField 
{
	//the char to store the characters of the Game Field
	
	private char[][] theField;
	
	//the constructor of the Game field to allow me to create an instance of this class to be able to use the methods of this class
	GameField()
	{
		theField = new char [10][10];
	}
	
	//the getter
	
	public char [][] getTheField()
	{
		return theField;
	}
	
	// the setter
	
	public void setTheField(char [][] theField)
	{
		this.theField = theField;
	}
	
	
	// with this method i will build the border left and right of the game
	public void buildTheBorderTopAndBottom()
	{
		for(int i = 0; i < theField.length; i++)
		{
			theField[0][i] = '#';
			theField[9][i] = '#';
		}
	}
	
	public void buildTheBordersLeftAndRight()
	{
		for(int i = 0; i < theField.length; i++)
		{
			theField[i][0] = '#';
			theField[i][9] = '#';
		}
	}
	
	
	
	//with this method i can print the field
	public void buildTheField()
	{
		for(int i = 0; i < theField.length; i++)
		{
			for(int j = 0; j < theField[i].length; j++)
			{
				System.out.print(theField[i][j]);
			}
			System.out.println();
		}
		
	}
	
		
	
	
	

}
