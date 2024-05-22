package de.example.game;

//import de.example.konsolewanderer.GameField;

public class Player 
{
	private char [] playerSign;
	private short currentColumn;
	private short currentRow;
	private short counter;
	private short steps;
	
	// i will give the constructor Player the argument GameField, to be able to interactive with the method of the class GameFIeld
	Player(GameField theField)
	{
		//now i will specifizise the signs and those index in the array
		playerSign = new char [4];
		playerSign[0] = '^';
		playerSign[1] = '>';
		playerSign[2] = 'v';
		playerSign[3] = '<';
		
		currentRow = 3;
		currentColumn = 3;
		counter = 0;
		
		theField.getTheField()[currentRow][currentColumn] = playerSign[counter];
	}
	
	// with this methods i will be able to rotate the player to the right
	// to be able to print the changes in the GameField, the method has to become the GameField instance as argument
	public void rotateToTheRigth(GameField theField)
	{
		if(counter == 0)
			counter = 1;
		else if(counter == 1)
			counter = 2;
		else if(counter == 2)
			counter = 3;
		else if(counter == 3)
			counter = 0;
		else
			System.out.println("You have just four directions to choose");
		
		theField.getTheField()[currentRow][currentColumn] = playerSign[counter];
		theField.buildTheField();
	}
	
	// with this methods i will be able to rotate the player to the left
	
	public void rotateToTheLeft(GameField theField)
	{
		if(counter == 0)
			counter = 3;
		else if(counter == 3)
			counter = 2;
		else if(counter == 2)
			counter = 1;
		else if(counter == 1)
			counter = 0;
		else
			System.out.println("You have just four directions to choose");

		theField.getTheField()[currentRow][currentColumn] = playerSign[counter];
		theField.buildTheField();
		
	}
	
	// with this method the player is able to go forward
	
	public void goForward(GameField theField)
	{
		//with this line of code, i can empty the current position of the the player in the field
		theField.getTheField()[currentRow][currentColumn] = ' ';
		
		//with this code, i will make sure that the next step of the player is not going to cross the border
		if(counter == 0 && (! ( theField.getTheField()[currentRow -1][currentColumn] == '#')))
		{
			theField.getTheField()[currentRow -1][currentColumn] = playerSign[counter];
			currentRow --;
			theField.buildTheField();
			
		}
		else if(counter == 1 && (! ( theField.getTheField()[currentRow][currentColumn +1] == '#')))
		{
			theField.getTheField()[currentRow][currentColumn +1] = playerSign[counter];
			currentColumn++;
			theField.buildTheField();
		}
		else if(counter == 2 && (!(theField.getTheField()[currentRow+1][currentColumn] == '#')))
		{
			theField.getTheField()[currentRow+1][currentColumn] = playerSign[counter];
			currentRow ++;
			theField.buildTheField();
		}
		else if(counter == 3 && (! ( theField.getTheField()[currentRow][currentColumn -1] == '#')))
		{
			theField.getTheField()[currentRow][currentColumn -1] = playerSign[counter];
			currentColumn--;
			theField.buildTheField();
		}
		else
		{
			theField.getTheField()[currentRow][currentColumn] = playerSign[counter];
			theField.buildTheField();
			System.out.println("You have reached the border you can't move forward, please change your direction to keep moving");
			System.out.println();
		}
	}
	
	public void numberOfStepsLeft(GameField theField)
	{
		/*I have to create a method, which will tell the player how much steps he or she can do in the direction that he or she choose
		 * 
		 * 
		 * 
		steps = 
		
		System.out.println("You can do " + 5 + "other steps in this direction");
		*/
	}
	
}
