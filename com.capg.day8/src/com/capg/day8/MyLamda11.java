package com.capg.day8;
interface lamda1
{
	public void print();
		
}
interface lamda12
{
	public void evenOrOddNum(int a);
}

public class MyLamda11 {

	public static void main(String[] args) {
		
		 lamda1 result = () -> System.out.println("Hello Java lambda");
	        result.print();
	     lamda12 evenoroddnum = (int a) -> {
	        	 
	            if(a%2==0)
	            {
	            System.out.println("even number");
	            }
	            else
	            {
	            	System.out.println("Odd Number");
	            }
	            System.out.println();
	     };
	            evenoroddnum.evenOrOddNum(10);

	       
	}
	       
	            
	     
	
		 
}