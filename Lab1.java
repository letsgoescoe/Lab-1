import java.util.Scanner;

public class Lab1 {

	private static final char[] Welcome = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring volume
		int volume;
		
		//declaring height
		int height;
		
		//declaring perimeter
		int perimeter;
		
		//Title of the forum
		System.out.println("Welcome to Grand Circus'Room Detail Generator!");
		
		//space
		System.out.println();
		
		
		//Allowing user input
		Scanner input = new Scanner(System.in);
		
		//Allowing user to continue by selecting y or (not continuing with n) the while loop will help continue if user request
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			//get input from user for length
			System.out.println("Enter Length:");
			double Length = Double.parseDouble(input.nextLine());
			
			//get input from user for width
			System.out.println("Enter Width:");
			double Width = Double.parseDouble(input.nextLine());
			
			// multiply and reply with calculation for Area
			System.out.println("area is" + Length * Width);
			
			//Space
			System.out.println();
			
			//add length and width and multiply by two
			perimeter = (int) ((Length + Width) * 2);
			System.out.println("perimeter is: " + perimeter);
			
			//Space
			System.out.println();		
			
			
			double height1 = 0;
			//to get volume length * width * height
			volume = (int) ((Length * Width * height1) * 2);
			System.out.println("volume is: " + volume);
			
			// Space
			System.out.println();
			
			// see if the user wants to continue
			System.out.println("Continue? (y/n): ");
			choice = input.nextLine();
			//  Space
			System.out.println();
			
			
			
			
		
		
					
			
		

	}
input.close();
System.out.println("BOY BYE... I AINT SORRY");
	}
}
