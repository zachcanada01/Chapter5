package Exercises;
import java.util.Scanner;
public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int condoChoice;
		int garageChoice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like a condo with park view, golf course view, or a lake view?");
		System.out.println("1 for the park view condo\n2 for the golf course view condo\n3 for the lake view condo");
		condoChoice = input.nextInt();
		
		if(condoChoice == 1)
		{
			System.out.println("You have chosen the condo with the park view and that will cost you $150,000.");
			System.out.println("Would you like to a 1 garage parking space, a 2 car garage parking space, or no garage with that? ");
			System.out.println("1 for a 1 car garage\n2 for a 2 car garage\n3 for no garage");
			garageChoice = input.nextInt();
			
			if(garageChoice == 1)
			{
				System.out.println("You have chosen a 1 car garage space and your total will now be $155,000.");
			}
			else if (garageChoice == 2)
			{
				System.out.println("You have chosen a 2 car garage space and your total will now be $157,500.");
			}
			else if (garageChoice == 3)
			{
				System.out.println("You have chosen no garage space and your total will still be $150,000.");
			}
		}
		else if(condoChoice == 2)
		{
			System.out.println("You have chosen the condo with the golf course view and that will cost you $170,000.");
			System.out.println("Would you like to a 1 garage parking space, a 2 car garage parking space, or no garage with that? ");
			System.out.println("1 for a 1 car garage\n2 for a 2 car garage\n3 for no garage");
			garageChoice = input.nextInt();
			
			if(garageChoice == 1)
			{
				System.out.println("You have chosen a 1 car garage space and your total will now be $175,000.");
			}
			else if (garageChoice == 2)
			{
				System.out.println("You have chosen a 2 car garage space and your total will now be $177,500.");
			}
			else if (garageChoice == 3)
			{
				System.out.println("You have chosen no garage space and your total will still be $170,000.");
			}
		}
		else if(condoChoice == 3)
		{
			System.out.println("You have chosen the condo with the golf course view and that will cost you $210,000,");
			System.out.println("Would you like to a 1 garage parking space, a 2 car garage parking space, or no garage with that? ");
			System.out.println("1 for a 1 car garage\n2 for a 2 car garage\n3 for no garage");
			garageChoice = input.nextInt();
			
			if(garageChoice == 1)
			{
				System.out.println("You have chosen a 1 car garage space and your total will now be $215,000.");
			}
			else if (garageChoice == 2)
			{
				System.out.println("You have chosen a 2 car garage space and your total will now be $217,500.");
			}
			else if (garageChoice == 3)
			{
				System.out.println("You have chosen no garage space and your total will still be $210,000.");
			}
		}
		else
		{
			System.out.println("You have not chosen a condo and will pay nothing");
		}
		
	
		
	}

}
