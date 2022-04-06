package com.capg.day3;
import java.util.*;
public class MyThrow {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   int a,b,c=0;
   try
   {
	   System.out.println("enter a and b values");
	   a=s.nextInt();
	   b=s.nextInt();
	   if(b==0)
	    throw new ArithmeticException();
	    else
	    {
	    	c=a/b;
	    	System.out.println("result is "+c);
	    }
   }
   catch(ArithmeticException e)
   {
	   System.out.println("catch..");
	   System.out.println(e);
   }
   finally
   {
	   System.out.println("finally will be executed Irrespective of Exception");
   }
	}

}
