package com.capg.day2;
interface A
{
	public void display();
}
 interface B
{
	public void display();
}
class Test implements A,B
{
public void display()
{
System.out.println("display will be displayed from A");	
}
public void display1()
{
	System.out.println("display will be displayed from B");
}
}

public class MyConstructor {

	public static void main(String[] args) {

		Test t=new Test();
		t.display();
		t.display1();
	}

}
