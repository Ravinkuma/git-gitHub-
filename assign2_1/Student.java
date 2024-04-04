package com.oops.assign2_1;

public class Student {
	
	// Class: class in java is a bluePrint or template which defines properties(fields: variable declarations
	// represent data of objects) and behaviors(methods: functions defined within a class. 
	// define the Behavior of the objects of the class)
	
    // Objects: Real world entities.  It is an instance of a class, created using the new keyword 
	// followed by a constructor call.
	
	private String name;
    private int age;
    private char grade;
    public Student(String name, int age, char grade) {
    	this.name=name;
    	this.age=age;
    	this.grade=grade;
    	}
	public void getName() {
		System.out.println("Name of student is "+ name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getAge() {
		System.out.println("Age of student is "+ age);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void getGrade() {
		System.out.println("Grade of student is "+ grade);
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
    
}
