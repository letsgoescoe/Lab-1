import java.util.Scanner;

/**
 * 
 */

/**
 * @author Student
 *
 */
public class Circlescircumference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarations
		Scanner userInput = new Scanner(System.in);
		int input;
		
		
		
		
		
		//Title of program
		System.out.println("Welcome to the Circle Tester");
		System.out.println();
		
		//while loop to provide radius or not contin

		

		
			//Start game
			System.out.println("Enter radius:");
			double userRadius = userInput.nextDouble();
		   System.out.println();
		 	
		 	
	//input and out for radius	 	
		 Circle myCirc = new Circle(userRadius);
		 
		System.out.println("The Circumference is: "  +  myCirc.getCircumference());
		 
		 System.out.println("The area = "+ myCirc.getArea());
		 
		 System.out.println("Continue? y/n");
		 input = userInput.nextInt();
		 
		 String choice = userInput.next();
		
		
				}
			   } // close while loop
		    
		
		 
		 
		 	
	

	
		 


