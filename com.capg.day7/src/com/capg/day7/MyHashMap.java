package com.capg.day7;
import java.util.*;
import java.util.Map.Entry;
public class MyHashMap {

	public static void main(String[] args) {
	
		HashMap <Integer,Cities> city= new HashMap<Integer,Cities>();
		 Cities knr=new Cities(101,"karimnagar","1h9","Telangana");
		 city.put(2, knr);
		 Cities jgt=new Cities(102,"Jagtial","1g9","Telangana");
		 city.put(3, jgt);
		 
		/* Set<Integer>keys=city.keySet();
			
			for(Integer cit : keys) {
				System.out.print("values "+cit);
			}*/
			Set<HashMap.Entry<Integer, Cities>> cit = city.entrySet();
			for (Entry<Integer, Cities> m : cit) {
				System.out.println();​​​​​​​
			}
			      ​​​​​​​
		 
		 
	      
	}

}
