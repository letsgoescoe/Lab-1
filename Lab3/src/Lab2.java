


import java.util.Random;
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pisces = 1;
		int gemini = 2;
		int capricorn = 3;
		
		// Get input from the user..system objects
		   Scanner input = new Scanner(System.in);
		   Random rand = new Random();
		   
		   // Game Variables
		   
		   System.out.println("Are you a pisces?");
		   String inputPisces = input.nextLine(); 
		   
		   int sign = 0;
			switch (sign) {
			   case 1:
				   System.out.println("You are a lover");
			       break;
			    case 2:
			    		System.out.println(" You are a fighter");
			       break;
			    case 3:
			    		System.out.println("You can be a lover or a fighter ");
			    		break;
			    	default:
			    		System.out.println("Oops you broke my game");
			    		break; 
		   
		   System.out.println("a gemini?");
		   String inputGemini = input.nextLine(); 
		   
		   System.out.println("or  a Capricorn?");
  	       String inputCapricorn = input.nextLine(); 
		   
		   }
		   
	}
}