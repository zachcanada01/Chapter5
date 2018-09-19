package Practice;
import java.util.Scanner;
public class DoorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int doorChoice;
		int chestChoice;
		int bookChoice;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing the door game! ");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door. \n1- for door One\n2- for door Two\n3- for door Three");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1)
		{
			System.out.println("Door one, good choice choose among the following chests.");
			System.out.println("1- For Chest One\n2- For Chest Two");
			chestChoice = input.nextInt();
			if(chestChoice == 1) 
			{
				result = " a pile of gold";
			}
			else if(chestChoice == 2) 
			{
				result = " nothing ";
			}
			else if(chestChoice == 3) 
			{
				result = "just kidding, I said 1 or 2!";
			}
			
			
		}
		
		else if(doorChoice == 2){
		    result = " a donkey";
		}
		else if(doorChoice == 3){
			result = " a barely compitent cashier";
		}
		else if(doorChoice == 999) 
		{
		System.out.println("You enter a special room with three books on a table, there are no"
				+ " words on the cover. Do you choose Book 1, Book 2, or Book 3?");
			bookChoice = input.nextInt();
			if(bookChoice == 1)
			{
				result = "All the knowledge in the world";
			}
			else if(bookChoice == 2)
			{
				result = "Just a coloring book";
			}
			else if(bookChoice == 3)
			{
				result = " Magical powers, just kidding you got nothing";
			}
				
		}
		else
		{	
			result = " nothing because that was not a choice!";
		}
		displayMessage(result);

	}
	public static void displayMessage(String result) {
		System.out.println("You won" + result);
	}

}
