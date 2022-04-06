package com.capg.day2;
import java.util.*;
public class LargeAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     int num1,num2,num3;
     System.out.println("enter three  numbers");
     num1=s.nextInt();
     num2=s.nextInt();
     num3=s.nextInt();
     
     if(num1==num2 && num2==num3)
     {
    	System.out.println("all numbers are equal"); 
     }
     else if(num1>num2 && num1>num3)
     {
    	 System.out.println( num1+ " is the greatest number");
     }
     else if(num2>num3)
     {
    	 System.out.println(num2+ " is the greatest number");
     }
     else
     {
    	 System.out.println(num3+ " is the greatest number");
     }
     
	}

}
