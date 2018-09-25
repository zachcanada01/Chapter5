package Exercises;
import java.util.Scanner;
public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int condoChoice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like a condo with park view, golf course view, or a lake view?");
		System.out.println("1 for the park view condo\n2 for the golf course view condo\n3 for the lake view condo");
		condoChoice = input.nextInt();
		
		if(condoChoice == 1)
		{
			System.out.println("You have chosen the condo with the park view and that will cost you $150,000.");
		}
		else if(condoChoice == 2)
		{
			System.out.println("You have chosen the condo with the golf course view and that will cost you $170,000.");
		}
		else if(condoChoice == 3)
		{
			System.out.println("You have chosen the condo with the golf course view and that will cost you $210,000,");
		}
		else
		{
			System.out.println("You have not chosen a condo and will pay nothing");
		}
		
		
	}

}
