package com.capg.day2;
import java.util.*;
public class ForUsingScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
      System.out.println("enter any number above 100");
      int a=s.nextInt();
      for(int i=1;i<=a;i+=2)
      {
    	 System.out.println(i); 
      }
	}

}
