package demo;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String args[])
	{
		//take input from user
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
		Long number = sc.nextLong();
		Long revnumber=0L;
		
		while(number!=0)
		{
			revnumber = (revnumber*10) + (number % 10) ;
			number = number/10;
		}
		
		System.out.println("Reverse number is" + revnumber);
		sc.close();
		
		
	}
	
	
}
