package com.capg.day8;
import java.util.*;
public class MyStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
        list.add(20);
        list.add(1);
        list.add(10);
		list.add(-8);
      long count = list.stream().filter(e->e<0).map(num->num*2).sorted(Collections.reverseOrder()).distinct().count();
      
      
		System.out.print(count);         
		    }​​​​​​​
}     


