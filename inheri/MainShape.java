package com.oops.inheri;

public class MainShape {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Shape s=new Shape();
		s.calculateArea();
          Circle c=new Circle();
          Rectangle r=new Rectangle();
          r.l=5;
          r.w=8;
          c.r=5;
          c.calculateArea();
          r.calculateArea();
          s.calculatePerimeter();
          c.calculatePerimeter();
          r.calculatePerimeter();
	}

}
