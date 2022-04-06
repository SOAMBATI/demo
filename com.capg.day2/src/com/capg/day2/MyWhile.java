package com.capg.day2;
import java.util.*;
public class MyWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
      System.out.println("enter a number");
      int a=s.nextInt();
      int i=1;
      while(i<a)
      {
    	  System.out.println(i);
    	  i=i+2;
      }
	}

}
