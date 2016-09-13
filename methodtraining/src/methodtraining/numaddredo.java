package methodtraining;

import java.util.Scanner;

public class numaddredo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);

		//Declarations
		int input;
		
		
		
		//title of game
		System.out.println("Learn your squares and cubes!");
		
		//space
		System.out.println();
		
		// game start user input number
		System.out.println("Enter an integer: ");
		
		String choice = "y";
		while (choice.equals("y")) {
		
		input = userInput.nextInt();
		
		//outcome title for the squared and cubed
		System.out.println("Number\t" +"Squared\t" + "Cubed\t");
		System.out.println("======\t"  + "======\t"+ "======\t");
		
		//math method for squared and cubed
		
	
		

		for (int i = 1; i <= input; i++) {
			
			
			int numberSquared = (int) Math.pow(i,2);
			int numberCubed = (int) Math.pow(i,3);
			  
			
		// output for results
			String message=("i"+ "\t" + numberSquared +"\t" + numberCubed);
					System.out.println(message);
	
			}
		// Continue block

					System.out.print("Continue? (y/n): ");
					choice = userInput.next();
					System.out.println();
					
					// game start user input number
					System.out.println("Enter an integer: ");
		
	}
}
}

