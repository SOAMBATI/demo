package com.capg.day3;
import java.util.*;
public class InpMisMatch {

	public static void main(String[] args) {
    try
    {
    	Scanner s=new Scanner(System.in);
    	int empid;
    	System.out.println("enter employee id");
    	empid=s.nextInt();
    	System.out.println("employee ID "+empid);
    }
    catch(InputMismatchException e) 
    {
    	System.out.println(e);
    }
	}

}
