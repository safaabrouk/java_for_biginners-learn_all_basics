package finalProject;

import java.util.Scanner;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" *** Hello welcome to the food app *** ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please create a password: ");
		String password = sc.next();
		System.out.println("Your password is now: "+password);
		
		System.out.println("Please enter your password: ");
		String currentPassword = sc.next();
		
		while(!password.equals(currentPassword)) {
			System.out.println("This is not the right password please try again: ");
			currentPassword = sc.next();
		}
		
		System.out.println("Access granted ;)");
		System.out.println("Are you hungry? (Ansewer by yes or no)");
		String answer1 = sc.next();
		
		if(answer1.equals("yes")) {
			int answer2;
			do {
			System.out.println("Choose what you want to eat: ");
			System.out.println("1. Pizza");
			System.out.println("2. Burger");
			System.out.println("3. Fish");
			System.out.println("0. Exit");
			answer2 = sc.nextInt();
			}while(answer2 != 0 && answer2 != 1 && answer2 != 2 && answer2 != 3 );
			
			switch(answer2) {
			case 1: System.out.println("Your choice is Pizza");
			break;
			case 2: System.out.println("Your choice is Burger");
			break;
			case 3: System.out.println("Your choice is Fish");
			break;
			default: System.out.println("Bye !!!");
			break;
			}
			
			if(answer2 == 1 || answer2 == 2 || answer2 == 3) {
				System.out.println("Do you want something to drink? (Ansewer by yes or no) ");
				String answer3 = sc.next();
				while(!answer3.equals("yes") && !answer3.equals("no")) {
					System.out.println("Wrong command please tray again !!! ");
					answer3 = sc.next();
					
					if(answer3.equals("yes")) {
						int answer4;
						do {
						System.out.println("What would like to drink ? ");
						System.out.println("1. Coffee");
						System.out.println("2. Juice");
						System.out.println("3. Tea");
						System.out.println("0. Exit");
						answer4 = sc.nextInt();
						}while(answer4 != 0 && answer4 != 1 && answer4 != 2 && answer4 != 3 );
						
						switch(answer4) {
						case 1: 
						case 2:
						case 3:
							System.out.println("Great you have ordered "+answer2+" and "+answer4);
						break;
						default : System.out.println("Great you have ordered just "+answer2);
						break;
						}
						
						System.out.println("Please confirm your password");
						currentPassword = sc.next();					
						while(!password.equals(currentPassword)) {
							System.out.println("This is not the right password please try again: ");
							currentPassword = sc.next();
						}
					}
				}
				System.out.println("Thank you your order is on it's way");
			}
			
		}
		else {
			System.out.println("Alright have a good day");
		}
	}

}
