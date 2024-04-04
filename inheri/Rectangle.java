package com.oops.inheri;

public class Rectangle extends Shape {
	public int l,w;
    public double area;
    public double perimeter;
    public Rectangle() {
 	   
    }
    public void calculateArea() {
 	   area=l*w;
 	   System.out.println("area of rectangle: "+area);
    }
    public void calculatePerimeter() {
 	   perimeter=2*(l+w);
 	   System.out.println("perimeter of rectangle: "+perimeter);
    }
}
