package com.oops.assign2_1;

public class Studentss {
	private String name;
    private int age;
    private char grade;
    public Studentss(String name, int age, char grade) {
    	this.name=name;
    	this.age=age;
    	this.grade=grade;
    	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
 
}
