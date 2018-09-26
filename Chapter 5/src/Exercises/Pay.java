package Exercises;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int skillLevel;
		int hoursWorked;
		int insuranceChoice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your skill level.");
		skillLevel = input.nextInt();
		System.out.println("Please enter the amount of hours you have worked.");
		hoursWorked = input.nextInt();
		System.out.println("If you skill level 2 or above would you like any of the following insurance options \n1 Medical insurance\n2 Dental insurance\n3 Long-term diability insurance\n4 all of the above");
		insuranceChoice = input.nextInt();
		
		
		
		
	}

}
