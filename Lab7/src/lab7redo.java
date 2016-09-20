
	import java.util.Scanner;
	
	
public class lab7redo {


public static void main(String[] args) {
				// TODO Auto-generated method stub
				//variables
						int num;
						String choice = "y";
						int option = 0;
						
						Scanner k = new Scanner(System.in);
						
						//outputs etc.....
						System.out.println("Would you like to know more about your classmate?");

			do{
						System.out.println("Which student would you like to learn more about?  Pick a number from 1 to 5:  ");
						num = k.nextInt();
					while(num < 0 || num > 5){//begin if statement to prompt input error correction
						System.out.println("That student does not exist.  Please try again. (enter a number from 1 to 5):  ");
						num = k.nextInt();
					}
					switch (num){
					case 1:
						System.out.println("Armani is from Detroit and his favorite color is red.  Want to know more? 1 for yes 2 for no");
						try{
						option = k.nextInt();
						}catch(IllegalArgumentException e){
							System.out.println("Try again.");
						}
							switch (option){
								case 1:
									System.out.println("Armani is a songwriter.");
									break;
								case 2:
									System.out.println("He was mentored by Brandy.");
									break;
								}
						break;
					case 2:
						System.out.println("Kristen is from Detroit and his favorite food is salmon.");
						break;
					case 3:
						System.out.println("Daniel is from Hamtramck, he loves Chinese food.");
						break;
					case 4:
						System.out.println("Kim is from Detroit, she is a graduate from Cass tech.");
						break;
					case 5:
						System.out.println("Elle is from Detroit, Her favorite food is salmon.");
						break;
						}
			System.out.println("Continue? y/n");
			k.nextLine();
			choice = k.nextLine();
				}while(choice.equalsIgnoreCase("y"));
			}//psvm

		//end class ThrowErrors

	}


