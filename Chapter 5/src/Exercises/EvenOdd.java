package Exercises;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		String result;
		Scanner input = new Scanner(System.in);
		
		
		
		
		System.out.println("Enter a number to see if it is even or odd");
		x = input.nextInt();
		
		if(x % 2 == 0 )
		{
			result = "even";
		}
		
		else {
			result = "odd";
		}
		
		displayMessage(result);

	}
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}

}
