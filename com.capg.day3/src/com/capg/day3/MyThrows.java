package com.capg.day3;
import java.io.*;
public class MyThrows {

	public static void main (String[] args)throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int a,b,c;
		System.out.println("Enter a and b values");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("sum is "+c);
	}
}
