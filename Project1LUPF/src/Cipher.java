import java.util.Scanner;
import java.util.Random;
public class Cipher {

	public static void main(String[] args) {
		/*-----------------------------------------------------------------------------------------------------------
		/
		/ Brent Harshbarger
		/ Programming Fundamentals
		/ Summer 2020
		/ Programming Assignment 1 (Cipher)
		/
		-------------------------------------------------------------------------------------------------------------*/
		
		// Print assignment information
		
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Brent Harshbarger");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println("");
		
				
		// Set up random number generator
		
		Random gen = new Random();
		int randNum = gen.nextInt(10);
		
		
		
		// Set up variables to get five numbers from the user between 0 and 19
		
		Scanner scan = new Scanner(System.in);
		
		int first;
		int second;
		int third;
		int forth;
		int fifth;
		
		
		// Begin the user interaction of the program
		
		System.out.println("Welcome to the Cipher program.");
		System.out.println("Please 5 numbers between 0 through 19."); 
		
		
		// Get the first number
		
		System.out.print("1st number: "); 
		first = scan.nextInt(); 
	
				
		// Evaluate if the number is in range; if not terminate program
		
		if (first > 19)	{
			
			System.out.println("Please read directions and try again!");
			System.exit(0);
				
		}
		
		if (first < 0)	{
			
			System.out.println("Please read directions and try again!");
			System.exit(0);
				
		}
		
		
		
		// Get the second number		
		
		System.out.print("2nd number: "); 
		second = scan.nextInt();
		
		// Evaluate if the number is in range; if not terminate program
		
		if (second > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0); 
		}
		
		if (second < 0)	{
			
			System.out.println("Please read directions and try again!");
			System.exit(0);
				
		}
		
		
		
		// Get the third number
		
		System.out.print("3rd number: "); 
		third = scan.nextInt();
		
		// Evaluate if the number is in range; if not terminate program
		
		if (third > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0); 
		}
		
		if (third < 0)	{
			
			System.out.println("Please read directions and try again!");
			System.exit(0);
				
		}
		
		
		
		// Get the forth number
		
		System.out.print("4th number: "); 
		forth = scan.nextInt();
		
		// Evaluate if the number is in range; if not terminate program
		
		if (forth > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0); 
		}
		
		if (forth < 0)	{
			
			System.out.println("Please read directions and try again!");
			System.exit(0);
				
		}
		
		
		
		// Get the fifth number
		
		System.out.print("5th number: "); 
		fifth = scan.nextInt();
		
		// Evaluate if the number is in range; if not terminate program
		
		if (fifth > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0); 
		}
		if (fifth < 0)	{
			
			System.out.println("Please read directions and try again!");
			System.exit(0);
				
		}
		
		
		System.out.println("");
		
		
		// Sum the numbers of the inputs																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
		
		int sum = (first + second + third + forth + fifth);
		
		// Print the sum, random number, and the encoded number to the screen for the user
		
		System.out.println("Total = " + sum);
		System.out.println("Your random key is " + randNum);
		
		
		// Calculate the digits for the encoding formula
		
		int encodeNum1 = (((sum/10)+randNum)%10);
		int encodeNum2 = (((sum%10)+randNum)%10);
		
		// Print encoded number to the screen
		
		System.out.println("Your encoded number is " + encodeNum1 + encodeNum2);
		 
		
		
		
	
	scan.close();
	
	}

}
