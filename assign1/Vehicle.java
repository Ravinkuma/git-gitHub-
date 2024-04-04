package com.oops.assign1;

public class Vehicle {
	// public access modifier accessible from any class of same or different package.
   public String name;
   
   // protected access modifier accessible from same class or different class of same package
   protected int numberOfWheels;
   protected int numberOfGears;
   
   // private variables are not accessible by any other class of method but using setter and
   // getter method we can access....... setter set and Update private data
   private int numberOfSeats;
   private int speedLimit;
   
   // constructor: A method that have same name as class name used to construct object and 
   // assign value..... non parameterized, parameterized, default and copy constructor.
   //         Constructors and destructors return nothing — NOT even void.
   public Vehicle(String name, int numberOfWheels, int numberOfGears, int numberOfSeats, int speedLimit) {
	   
	   // this keyword is used for instance variable(variable of class outside method)
	   this.name = name;
       this.numberOfWheels = numberOfWheels;
       this.numberOfGears = numberOfGears;
       this.numberOfSeats = numberOfSeats;
       this.speedLimit = speedLimit;
   }

public int getNumberOfSeats() {
	return numberOfSeats;
}

public void setNumberOfSeats(int numberOfSeats) {
	this.numberOfSeats = numberOfSeats;
}

public int getSpeedLimit() {
	return speedLimit;
}

public void setSpeedLimit(int speedLimit) {
	this.speedLimit = speedLimit;
}
   public void move() {
	   System.out.println(name+ " is moving" );   
	   }
   public void honk() {
	   System.out.println("peeeeeeeeeeeeee peeep");
   }
}
