package com.oops.assign2;

public class Truck extends Vehicle {
	public Truck(String name, int speedLimit) {
		super(name, speedLimit);
		// TODO Auto-generated constructor stub
	}
	public void run() {
		   System.out.println(name+" speed "+speedLimit +" kmph is runnig");  
		   }
	   public void honk() {
		   
		   System.out.println(name+" speed "+speedLimit +" kmph is blowing horn");
	   }

}
