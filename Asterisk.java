/* 
 * Jameel H. Khan 
 * Module 3 - Problem 1
 * EN.605.201.83.SP21 
 */ 

// import required package
import java.util.Scanner;

public class Asterisk
{
	public static void main( String [] args )
	{
		// Define and initialize variables for values to be input
		int astInput = 0;
		int pattern = 0;
		
		// Use Scanner to obtain input
		Scanner input = new Scanner ( System.in );
		System.out.println();
		System.out.print( "Enter the number of asterisks: " );
		astInput = input.nextInt(); // read input, number of lines
		System.out.println();
		System.out.print( "Select output pattern: 1-pine tree OR 2-tornado: ");
		pattern = input.nextInt(); // read input, pattern of output
		
		// output
		if ( pattern == 1 ) // pine tree pattern
		{
			for( int x = 1; x <= astInput; x++ )
			{
				int y = x;
				while( y >= 1 )
				{
					System.out.print( "*" );
					y--;
				} // end of while loop
				System.out.println();
			} // end of for loop
		} // end of if statement
		else // tornado pattern
		{
			for ( int x = astInput; x >= 1; x-- )
			{
				int y = x;
				while ( y >= 1 )
				{
					System.out.print( "*" );
					y--;
				} // end of while loop
				System.out.println();
			} // end of for loop
		} // end of else statement
	} // end of main method
} // end of class Asterisk
