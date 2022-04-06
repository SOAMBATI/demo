package com.capg.day2;
import java.util.*;
public class SumofFib {

	public static void main(String[] args) {
   Scanner s= new Scanner(System.in);
   int n;
   System.out.println("enter a number");
   n=s.nextInt();
   int a=0,b=1,c,sum=0;
   for(int i=1;i<=n;i++)
   {
	   c=a+b;
	   sum=sum+c;
	   a=b;
	   b=c;
  }
   System.out.println("sum of n fibonacci "+sum);
	}

}
