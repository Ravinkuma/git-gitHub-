package com.oops.assign2_1;

public class MainStd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student("Rohit",18,'C');
            obj.getName();
            //obj.getAge();
            obj.getGrade();
            
            obj.setAge(20);
            obj.getAge();
            
            Student obj2=new Student("John",19,'B');
            obj2.getName();
            obj2.getAge();
            obj2.getGrade(); 
            
           // obj.setAge(20);
            // obj.getAge();
            // ok but lets see with return type in class Studentss and MainStds within same package
	}

}
