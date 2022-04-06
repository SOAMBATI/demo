package com.capg.day2;
import java.util.*;
public class SimpleInt {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int time;
    double principleamount, interest;
     System.out.println("enter profit,interest,time");
     time=s.nextInt();
     principleamount=s.nextDouble();
     interest=s.nextDouble();
     double SI=(principleamount*time*interest)/100;
     System.out.println("Simple interest is "+SI);
    		 
	}

}
