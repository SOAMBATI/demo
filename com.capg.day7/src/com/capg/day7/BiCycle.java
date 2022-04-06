package com.capg.day7;

public class BiCycle {
int name;
String model;
public BiCycle(int name,String model)
{
	this.name=name;
	this.model=model;
	
}
public int getName() {
	return name;
}
public void setName(int name) {
	this.name = name;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public void print()
{
	System.out.println(getName());
	System.out.println(getModel());
}
}
