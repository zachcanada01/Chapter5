package Exercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		int low;
		int medium;
		int high;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number>>");
		num1 = input.nextInt();
		System.out.println("Pleas enter another number>>");
		num2 = input.nextInt();
		System.out.println("Please enter one more number>>");
		num3 = input.nextInt();
		
		if(num1 <= num2 && num1 <= num3);
		{
			low = num1; 
			if(num2<= num3)
			{
				//num2 as the second number
				//num3 as the third
				medium = num2;
				high = num3; 
			}
		if(num2 <= num1 && num2 <= num3);
		{
			low = num2;
			if(num1 >= num3)
			{
				//num3 as the second number
				//num1 as the third number
				medium = num3;
				high = num1;
		
				
			}
		}
		if(num3 <= num1 && num3 <= num2);
		{
			low = num3;
			if(num2 >= num1) 
			{
				//num1 as the second number
				//num2 as the third number
				medium = num1;
				high = num2;
				
			}
			
		}
		
		System.out.println(low + " " + medium + " " + high);

		}

	}

}
