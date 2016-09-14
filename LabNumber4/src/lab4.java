import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Factorial Calculator!");
		
		//Declarations
				int input;
				long fact;
		
		//Scan what users enter
		Scanner userInput = new Scanner(System.in);
		
		//While loop bc we will ask the user if they want to continue
		String choice = "y";
		while (choice.equals("y"))
		     
		{
			//beginning of the game
			System.out.println("Enter an integer that's greater than 0 but less than 10:");
			input = userInput.nextInt();
			fact = 1;
			//For loop to complete math	
			for (int i = 1; i <= input; i++)
		    fact =fact *i;       
	   
         //To see if user wants to continue
	    System.out.println("Factorial: "+fact);
				System.out.println("The factorial for input =");
				System.out.print("Continue? (y/n): ");
						choice = userInput.next();
						
						
	
		}
		System.out.println("Thanks for playing!");
	}
	
}
		

		



