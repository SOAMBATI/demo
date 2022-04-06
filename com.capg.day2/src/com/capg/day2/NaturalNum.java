package com.capg.day2;
import java.util.*;
public class NaturalNum {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   int num , sum=0;
   System.out.println("enter any number");
   num=s.nextInt();
    int i=1;
    while(i<=num)
    {
     sum=sum+i;	
     i++;
	
    }
    System.out.println(sum);
	}

}
