package com.oops.interfac;

public class MainResizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(6);
		c.resize(50);
		System.out.println("area of circle after resizing radius: "+String.format("%.3f",c.calculateArea()));
		
		Rectangle r=new Rectangle(8,5);
		r.resize(50); 
		//r.resize(35);
		
System.out.println("area of rectangle after resizing length and width: "+String.format("%.2f",r.calculateArea()));

	}

}
