package com.oops.abstr;

public class Circle extends Shape  {
        double radius;
        public Circle(double radius) {
        	this.radius=radius;      }
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;    //Math.PI
	}

	@Override
	double calculatePerimeter() {
		return 2*3.14*radius;  //Math.PI
		
		
	}

}
// writing here to check git message
// to see  the change in git bash