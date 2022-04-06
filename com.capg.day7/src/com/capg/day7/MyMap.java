package com.capg.day7;
import java.util.*;
public class MyMap {

	public static void main(String[] args) { 
		
		TreeMap <Integer,String> map=new TreeMap<Integer,String>();
		map.put(1002,"soumya");
		map.put(1002,"manasa");
		map.put(1003,"Renuka");
		map.put(1004,"Rajesham");
		map.put(1005,"Shiva");
		
		System.out.println(map.get(1004));
		if(map.isEmpty())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
		map.remove(1001);
		System.out.println(map.get(1001));
		map.size();
		
		Set<Integer>keys=map.keySet();
		
		for(Integer key : keys) {
			System.out.print("values "+keys);
		}
		
	}
}