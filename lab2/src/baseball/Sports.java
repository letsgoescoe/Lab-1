/**
 * This is a demo app 
 */
package baseball;

import java.util.Scanner;

/**
 * @author Student
 *
 */
public class Sports {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputbaseball, inputbasketball, inputfootball;
		boolean Baseball = false, Basketball = false, Football = false;
		
		String inputContinue;
		boolean userContinue = true;
		
		// Get input from the user
		   Scanner input = new Scanner(System.in);
		   
		   while(userContinue){
		   
		   System.out.println("Do you like basketball?");
		   inputbaseball= input.nextLine();  
		   
		   System.out.println("baseball?");
		   inputbasketball= input.nextLine(); 
		   
		   System.out.println("football?");
  	       inputfootball= input.nextLine(); 
		   
		   //Test if the variables are working properly
		   //System.out.println(Baseball = "" +basketball = "" +football="");
		 
		// Set condition variables based on input
		if(inputbaseball.equalsIgnoreCase("yes)")) {
			Baseball = true;
		}
			if(inputbasketball.equalsIgnoreCase("yes)")) {
				Basketball = true;
			}
				if(inputfootball.equalsIgnoreCase("yes)")) {
					Football = true;
				}	
		// Use if statement to decide what to wear
			if(Baseball) {
				
				if(Basketball){
					System.out.println("Your tall");
				} else if(Football){
				System.out.println("Your buff");
				
				//catch all 
				} else {
					System.out.println("Your a good guy");
				}
				
			} else {
				System.out.println("Your Michael Jordan");
			}
		   //Ask if you want to continue
			System.out.println("Would you like to continue?");
			inputContinue = input.nextLine();
			if(inputContinue.equals("yes")){
				userContinue = true;
			} else {
				userContinue = false;
			}
		   } // close while loop
	
					
				}

					}
				
