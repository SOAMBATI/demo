package com.capg.day8;
class First implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<10;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
public class MyThread1111 {

	public static void main(String[] args) {
		First f=new First();
		Thread t=new Thread(f);
		t.start();
		
	}

}
