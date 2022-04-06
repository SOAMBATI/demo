package com.capg.day4;

class Student {
	private int rno;
	private String name;
	private int section;

	public Student(int rno, String name, int section) {
		this.rno = rno;
		this.name = name;
		this.section = section;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

}

public class MyEnc {

	public static void main(String[] args) {
		Student s=new Student(101,"abc",1);
		System.out.println(s.getRno());
		System.out.println(s.getName());
		System.out.println(s.getSection());
		
	}

}
