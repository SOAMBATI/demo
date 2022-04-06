package com.capg.day2;
import java.util.*;
public class MyDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
     System.out.println("enter any number");
     int a=s.nextInt();
     
     int i=1;
     do
     {
    	 System.out.println(i);
    	i=i+2; 
     } while(i<a);
	}

}
