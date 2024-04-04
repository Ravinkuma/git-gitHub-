package com.oops.interfac;

public class Rectangle implements Resizable {
      double l;
      double w;
	public Rectangle(double l, double w) {
		super();
		this.l = l;
		this.w = w;
	}
	@Override
	public void resize(int percentage) {
		// TODO Auto-generated method stub
		l *= percentage / 100.0;
        w *= percentage / 100.0;
        System.out.println(percentage+"% of length of rectangle is "+l);
        System.out.println(percentage+"% of width of rectangle is "+w);


	}
	public double calculateArea() {
		return l*w;
	}
      
}
