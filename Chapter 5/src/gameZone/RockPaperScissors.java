package gameZone;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computerGuess;
		int userChoice;
		String result = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1-Rock\n2-Paper\n3-Scissors");
		userChoice = input.nextInt();
		
		if(computerGuess == 1)
		{
			if(userChoice == 1)
			{
				result = "tie";
			}
		}
		
		displayMessage(result);
			
	}
	
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}
}
