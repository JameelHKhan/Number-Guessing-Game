/* 
 * Jameel H. Khan 
 * Module 3 - Problem 2
 * EN.605.201.83.SP21 
 */ 

// import required packages
import java.util.Scanner;
import java.lang.Math;

public class Number
{
	public static void main( String [] args )
	{
		// Define and initialize variables for values to be input
		int N = 0; // upper range of potential number pool, select by user
		int totalGuesses = 0;
		int randomNumber = 0;
		int userGuess = 0;
		int guessesUsed = 0;
		int i = 0; // will be used for game menu loop: continue or exit
			
		/* 
		 * The following while statement serves as the program's main control 
		 * structure. It will loop continuously until the user selects "2" when 
		 * prompted if he/she wishes to continue playing or to exit.
		 */
		while ( i != 2 )
		{
			// Use Scanner to obtain input
			Scanner input = new Scanner ( System.in );
			System.out.println();
			System.out.print( "Welcome to The Number Guessing Game!");
			System.out.println();
			System.out.print( "Select a postive number greater than 1: ");
			// receive range input and save to variable
			N = input.nextInt();
			System.out.println();
			System.out.print( "Thank you! In this game, you will try to guess a "
							+ "number between 1 and " + N + "." );
			System.out.println();
			System.out.print( "Enter the total number of guesses you can make: ");
			// receive total user allowed attempts and save to variable
			totalGuesses = input.nextInt();
			
			// Generate a random number
			randomNumber = (int)(N * Math.random() ) + 1;
			
			/* 
			 * The following for statement iterates the game based on the 
			 * parameters set by the user (i.e. total number of guess attempts 
			 * inputted from above. It also determines if the user guessed 
			 * correctly, too low, or too high.
			 */
			
			for ( int x = 1; x <= totalGuesses; x++ )
			{
				System.out.println();
				System.out.print( "Guess a number: " );
				userGuess = input.nextInt();
				if ( userGuess == randomNumber )
				{
					guessesUsed++;
					System.out.print( "Correct! It took you " + guessesUsed 
									+ " guesses to choose the correct number.");
					/*
					 * If the player guesses correctly and wins, they must be prompted 
					 * to either play again or exit. The following input request and if 
					 * statement processes either the continuation of the game or ends 
					 * the while loop to exit the game.
					 */
					System.out.println();
					System.out.print( "Would you like to play again? Enter 1 for Yes"
							+ " or 2 to exit the game: ");
					// receive user input to play again or exit
					i = input.nextInt();
					if ( i == 2 )
					{ // exit game
						System.out.println( "Goodbye! ");
					}
					else
					{ // resetting variable in preparation for new game
						guessesUsed = 0;
					} // end of i == 2 if statement
					/*
					 * Here the break keyword ends the for loop and the program returns 
					 * to the top of the while loop.  Depending on the user input for i, 
					 * the while loop will either continue or terminate.
					 */
					break;
				}
				else if ( userGuess < randomNumber )
				{
					guessesUsed++;
					System.out.print( "Too low!" );
				}
				else
				{
					guessesUsed++;
					System.out.print( "Too high!" );
				} // end of userGuess == ramdomNumber if statement
			} // end of for loop
			/*
			 * The following if statement goes into effect if the player uses 
			 * all of their guess attempts before guessing the correct number.
			 * The output of the game results is printed and the user is 
			 * presented with the menu to continue or exit.
			 */
			if ( guessesUsed == totalGuesses & userGuess != randomNumber )
			{
				System.out.println();
				System.out.print( "You've guessed " + guessesUsed 
						+ " times and can no longer continue." 
						+ " The correct number is " 
						+ randomNumber + ".");
				System.out.println();
				System.out.print( "Would you like to play again? Enter 1 for Yes"
						+ " or 2 to exit the game: ");
				i = input.nextInt();
				if ( i == 2 )
				{
					System.out.println( "Goodbye! ");
				}
				else
				{ // resetting variable in preparation for new game
					guessesUsed = 0;
				} // end of i == 2 if statement
			} // end of guessesUsed == totalGuesses & if statement
		} // end of while loop
	} // end of main method
} // end of class Number
