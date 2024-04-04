package com.oops.assign2;

public class Vehicle {
   String name;
   int speedLimit;
   public Vehicle(String name, int speedLimit) {
	   this.name=name;
	   this.speedLimit=speedLimit;
	   
   }
   //method overriding occurs when a subclass (child class) has the same method as the parent class.
   public void run() {
	   System.out.println(name+" speed "+speedLimit +" kmph is runnig");  
	   }
   public void honk() {
	   System.out.println(name+" speed "+speedLimit +" kmph is bowing horn");
   }
}
