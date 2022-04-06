package com.capg.day01;
enum month{
 jan,feb,mar,apr,jun,jul,aug,sept,oct,nov,dec
}
enum day{
	sunday,monday,tuesday,thursday,friday,saturday
}
public class MyEnum {

	public static void main(String[] args) {
		System.out.println(month.jan);
		System.out.println(month.apr);
		System.out.println(month.jun);
		System.out.println(month.jul);
		System.out.println(month.aug);
		System.out.println(month.sept);
		System.out.println(month.dec);
		System.out.println(day.monday);
		System.out.println(day.valueOf("tuesday"));
		System.out.println(day.friday);
		System.out.println(day.valueOf("saturday"));
		System.out.println(day.sunday);
		
	}

}
