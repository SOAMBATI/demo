package com.capg.day2;
import java.util.*;
public class MyLeap {

	public static void main(String[] args) {
   Scanner m= new Scanner(System.in);
   int year;
   System.out.println("enter any Year");
   year=m.nextInt();
    if((year%4==0&&year%100!=0)||year%400==0)
    {
    	System.out.println(year+ " is leap Year");
    }
    else
    {
    	System.out.println(year+ " is not a leap year");
    }
	}

}
