package com.capg.day5;

import java.util.Scanner;

public class MyArraySmall {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
    int arr[]=new int[4];
    int min=arr[0];
    System.out.println("enter array elements are");
    for(int i=0;i<arr.length;i++) {
    
    	arr[i]=s.nextInt();    
	}
	for(int i=1;i<arr.length;i++)
    {
		if(min>arr[i]) {
		min=arr[i];	
		}
    }
	System.out.println(min);
	}

}
