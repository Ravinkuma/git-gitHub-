package com.oops.inheri;

public class Circle extends Shape {
       public int r;
       public double area;
       public double perimeter;
       public Circle() {
    	   
       }
       public void calculateArea() {
    	   area=r*r*3.14;
    	   System.out.println("area of circle: "+area);
       }
       public void calculatePerimeter() {
    	   perimeter=2*3.14*r;
    	   System.out.println("perimeter of circle: "+perimeter);
       }
}
