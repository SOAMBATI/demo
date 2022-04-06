package com.capg.day8;
import java.util.*;
class comp
{
	int Id;
	String name;
	double salary;
	public comp(int Id,String name,double salary)
	{
		this.Id=Id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	@Override
	public String toString() {
		return "comp [Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
public class MySream11 {

	public static void main(String[] args) {
		ArrayList<comp> als=new ArrayList<comp>();
		als.add(new comp(101,"Soumya",12300.00));
		als.add(new comp(102,"Manasa",12400.00));
		als.add(new comp(103,"Shiva",12500.00));
		als.add(new comp(104,"Rajesham",12600.00));
		als.add(new comp(105,"Renuka",12800.00));
		//als.stream().forEach(System.out::println);
		als.stream().filter(e->e.getSalary()>12700.00).forEach(System.out::println);
		
		
		}

}
