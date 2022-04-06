package com.capg.day5;
import java.util.*;
public class MyArraylarge {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int arr[]=new int[4];
    int max=arr[0];
    System.out.println("enter array elements are");
    for(int i=0;i<arr.length;i++) {
    
    	arr[i]=s.nextInt();    
	}
	for(int i=0;i<arr.length;i++)
    {
		if(max<arr[i]) {
		max=arr[i];	
		}
    }
	System.out.println(max);
	}
}
	


