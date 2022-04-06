package com.capg.day4;

class person
{
	private int id;
	private String name;
	private double salary;

	public person(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class MyEncapsule {

	public static void main(String[] args) {
		person p = new person(1001, "Manasa", 20000);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getSalary());
	}

}
