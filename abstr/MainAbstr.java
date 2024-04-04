package com.oops.abstr;

public class MainAbstr {
       public static void main(String []args) {
    	   Circle c=new Circle(5.5);
    	   System.out .println("Area of circle "+c.calculateArea());
    	   System.out .println("perimeter of circle "+c.calculatePerimeter());

    	   Triangle t=new Triangle(5.5,6,7);
    	   System.out .println("Area of triangle "+String.format("%.2f",t.calculateArea()));
    	   System.out .println("perimeter of triangle "+t.calculatePerimeter());
       }
}
