package com.capg.day3;
import java.util.*;
public class MyArith {

	public static void main(String[] args) {
    try
    {
    	Scanner s=new Scanner(System.in);
    	int a,b;
    	System.out.println("enter a value");
    	a=s.nextInt();
    	System.out.println("enter b value");
    	b=s.nextInt();
    	int c=a/b;
    	System.out.println("result is "+c);
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }
	}

}
