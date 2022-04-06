package com.capg.day3;
import java.util.*;
public class MyFinally {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   try
   {
		int a,b,c;
		System.out.println("enter a and b values");
		a=s.nextInt();
		b=s.nextInt();
		c=a/b;
		System.out.println("result is "+c);
   }
	catch( Exception e)
		   {
			 System.out.println(e);  
		   }
   finally
   {
	   System.out.println("Finally will executed");
   }
	}

}
