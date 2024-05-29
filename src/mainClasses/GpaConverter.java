package mainClasses;

import java.util.Scanner;

public class GpaConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many course you had this semester");
		Scanner sc = new Scanner(System.in);
		int nbrCourse = sc.nextInt();
		
		double[] courses = new double[nbrCourse];
		double sum = 0;
		
		for (int i = 0; i < courses.length; i++) {
			System.out.println("Enter your average for the course "+(i+1)+": ");
			courses[i] = sc.nextDouble();
		}
		
		// Calculate sum of notes :
		for (int i = 0; i < courses.length; i++) {
			sum += courses[i];
		}
		
		double average = sum/courses.length;
		
		if(average > 90) {
			System.out.println("You have A !!!");
		}
		else if(average > 80 && average <= 90 ) { // 80< average <=90
			System.out.println("You have B !!!");
		}
		else if(average > 70 && average <= 80 ) { // 70< average <=80
			System.out.println("You have C !!!");
		}
		else if(average > 60 && average <= 70) { // 60< average <=70
			System.out.println("You have D !!!");
		}
		else if(average < 60 ) { // average <60
			System.out.println("You have failed !!!");
		}
		else {
			System.out.println("Please try again");
		}
		
		
	}

}
