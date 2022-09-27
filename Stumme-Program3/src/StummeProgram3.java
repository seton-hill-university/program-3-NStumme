// Application:		Program 3
// Name:			Nicky Stumme
// GitHub User:		NStumme
// Date:			September 27, 2022
// Version: 		1.0
// Description:		Loops
import java.util.Scanner;

public class StummeProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Asking for the persons name
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = keyboard.next();
		
		// Asking for their integer
		System.out.print("Choose a number between 0 and 100: ");
		int number = keyboard.nextInt();
		
		//while loop
		while (number < 0 || number > 100)
		{
			System.out.println("That number is invalid.");
			System.out.print("Please enter a new number in the range of 0 - 100: ");
			
			number = keyboard.nextInt();
			
		}
		while (number >= 0 || number <= 100)
		{
			System.out.println("Thank you for your input, " + name);
			break;
		} 
		System.out.println();
		System.out.println("Count down until reactor meltdown!");
		 
		//For loop to present a count down 
		for (int i = 0; i < 10; i++)
			for(int j = 0; j < number; j++)
			while (number <= 100 && number >= 0)
			{
				System.out.println(number);
				number--;
				
			}
				System.out.println("Have a nice day!");
				System.out.println("BOOM!");
		
		
	}

}
