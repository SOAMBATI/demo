package com.capg.day7;
import java.util.*;

class Honda extends Thread {
	public void run()
	{
		System.out.println("My thread started");
	}
	
}
public class MyThread {

	public static void main(String[] args) {
		Honda t=new Honda();
		Thread t1=new Thread(t);
		t1.start();
		
		
		
		//t1.run();
	}

}
