package demo;

import java.util.Scanner;

public class checkPrime {
	
	public static void main(String a[])
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    Integer num = sc.nextInt();
	    boolean flag = false;
	    while(num!=0) 
	    {
	       for(int i =2; i < num ; i++)
	       {
	    	   if((num/i)==0)
	    	   {
	    		   System.out.println("number");
	    		   flag = true;
	    		   break;
	    	   }
	       }
	    }
       if(flag==true)
	    	System.out.println("the number is not prime");
	    else
	    	System.out.println("the number is prime");
	    sc.close();
	}
}
