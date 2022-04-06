package com.capg.day5;
import java.util.*;
public class myString1 {

	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  String name;
	  String name1=new String("Soumya");
	  System.out.println("enter your name");
      name=s.nextLine();
      if(name.equalsIgnoreCase(name1))
      {
    	  System.out.println("True");
      } 
      else
      {
    	  System.out.println("false");
      }
      if(name==name1)
      {
    	System.out.println("true");  
      }
      else
      {
    	  System.out.println("false");
      }
      System.out.println(name.isEmpty()+ " for isEmpty method");
      System.out.println(name.isBlank());
      System.out.println(name.toUpperCase());
      System.out.println(name.toLowerCase());
      System.out.println(name.replace('y','n'));
      System.out.println(name.substring(3));
      System.out.println(name.subSequence(2,4));
      System.out.println(name.trim());
      System.out.println(name.length());
      System.out.println(name.contains("mya"));
      System.out.println(name.indexOf('o'));
	}

}
