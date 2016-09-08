package gcLab;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Header
		System.out.println("Welcome! What is your name? (Enter your name here):") ;
		
		//Allowing user to type name
		String name = "name";
		while (name.equalsIgnoreCase("name")); 
		
		//Space
		System.out.println();
		
		//Allowing user input
		Scanner input = new Scanner(System.in);
		
		// Would you like to play a game question. With yes or no response
		System.out.println("Would you like to play a game? (Enter yes or no):");
		
		//Allowing user to continue by selecting y or (not continuing with n) the while loop will help continue if user request
		String choice = "y";
		while (choice.equalsIgnoreCase("y")); 
	

	}

}
