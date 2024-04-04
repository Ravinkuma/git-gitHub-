package com.oops.interfac;
 
/*An interface in java is a bluePrint of a class.
 Method and class declaration in interface is the same as abstraction.
 Interface implemented in class that’s why it is called as bluePrint of class.
 
 In Java, an interface is a reference type that defines a set of abstract methods. It's a way to 
 achieve abstraction and multiple inheritance.
 */

public class Circle implements Resizable {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void resize(int percentage) {
		// TODO Auto-generated method stub
        radius = radius*percentage/100.0;
    System.out.println(percentage+"% of radius of circle is "+radius);
		
	}
	public double calculateArea() {
		return Math.PI*radius*radius;
	}


}
