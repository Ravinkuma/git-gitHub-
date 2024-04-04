package com.oops.assign2_1;

public class MainStds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentss s1=new Studentss("rohit",18,'C');
		System.out.println("Name of student1 is "+s1.getName());
		System.out.println("Age of student1 is "+s1.getAge());
		System.out.println("Grade of student1 is "+s1.getGrade());

		Studentss s2=new Studentss("John",19,'B');
		System.out.println("Name of student2 is "+s2.getName());
		System.out.println("Age of student2 is "+s2.getAge());
		System.out.println("Grade of student2 is "+s2.getGrade());
	}

}
