package com.capg.day8;
interface positive
{
	public void positiveOrNegative(int a);
}
public class MyLamda12 {

	public static void main(String[] args) {
		positive posorneg = (int a) -> {
       	 
            if(a>=0)
            {
            System.out.println("positive number");
            }
            else
            {
            	System.out.println("negative Number");
            }
            System.out.println();
     };
            posorneg.positiveOrNegative(-2);
	}

}
