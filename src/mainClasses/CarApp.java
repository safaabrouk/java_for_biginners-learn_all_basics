package mainClasses;

import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Do you want a car ? (Ansewer by yes or no)");
		Scanner sc = new Scanner(System.in);
		String ansewer = sc.next();
		
		if(ansewer.equals("yes")) {
			System.out.println("What is your favorite color between red,blue and yellow ? ");
			String color = sc.next();
			
			if(color.equals("red")) {
				System.out.println("We can have it in stock would you like to see it Yes or No ? :) ");
				String redCar = sc.next();
				if(redCar.equals("yes")) {
					System.out.println("Great ! let's check the car ;)");
				}
				else {
					System.out.println("Thank you !");
				}
				
			}
			else if(color.equals("blue")) {
				System.out.println("We can order it ;) ");
			}
			else {
				System.out.println("We don't have it in stock :( ");
			}
		}
		else {
			System.out.println("Have a nice day !");
		}
	}

}
