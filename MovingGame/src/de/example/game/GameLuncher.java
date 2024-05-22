package de.example.game;

import java.util.Scanner;

public class GameLuncher
{
	public static void main(String[] args)
	{
		//The scanner to ask the user to make a choice
		Scanner scanner = new Scanner(System.in);
		
		//creation of the instance of the class GameField
		GameField game = new GameField();
		
		// build the borders
		game.buildTheBordersLeftAndRight();
		game.buildTheBorderTopAndBottom();
		
		//builds the empty field 
		//game.buildTheField();
		
		// i create a instance of the class Player to be able to print the player in the field
		// after the creation i will give the instance an argument of the GameField instance which is in this case game
		//to be able to interact with the class GameField
		Player player1 = new Player(game);
		
		System.out.println("Hello welcome to the game!");
		
		game.buildTheField();
		//to keep asking the user to do an action
		boolean keepPlaying = true;
		
		while(keepPlaying)
		{
			System.out.println("Please enter a command to do a action");
			System.out.println("Forward: press f; Rotate to the left: press l; Rotate to the right: press r");
			
			String input = scanner.next();
			
			if(input.equals("f"))
			{
				player1.goForward(game);
			}
			else if(input.equals("r"))
			{
				player1.rotateToTheRigth(game);
			}
			else if(input.equals("l"))
			{
				player1.rotateToTheLeft(game);
			}
			else if(input.equals("x") )
			{
				keepPlaying = false;
			}
			else
			{
				System.out.println("This command has no action");
				game.buildTheField();
				System.out.println("Forward: press f; Rotate to the left: press l; Rotate to the right: press r");
				System.out.println();
			}
			
		}

		


	}

}
