package Exercises;
import java.util.Scanner;
public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutes;
		int textMessages;
		int dataUsage;
		String result = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many minutes are you gonna use in one month on average?");
		minutes = input.nextInt();
		System.out.println("How many texts are you gonna send in one month on average?");
		textMessages = input.nextInt();
		System.out.println("How much data are you gonna use on average in one month?");
		dataUsage = input.nextInt();
		
		if (minutes < 500 && dataUsage == 0 && textMessages == 0 )
		{
			result = "You need to get plan A at $49 a month.";
		}
		else if (minutes < 500 && textMessages > 0 && dataUsage == 0 )
		{
			result = "You should get plan B at $55 a month";
		}
		else if (minutes > 500 && textMessages > 100 && dataUsage == 0)
		{
			result = "You should get plan C with up to 100 text messages at $61 a month or plan D for 100 text messages or more at $70 per month.";
		}
		else if (minutes > 0 && textMessages > 0 && dataUsage > 0 )
		{
			result = "You should get plan E for up to 2 gigabytes at $79 or plan F for $79 for 2 gigabytes or more at $87.";
		}
		
		
		displayMessage(result);
	}
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}

}
