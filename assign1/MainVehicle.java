package com.oops.assign1;

public class MainVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new Vehicle("Car",4,5,8,100);// constructor is parameterized otherwise obj.name= "car";
		System.out.println("name of vehicle is " + obj.name);
		System.out.println("number of wheels is " + obj.numberOfWheels);
		System.out.println("number of geers is " + obj.numberOfGears);
		System.out.println("number of seats is " + obj.getNumberOfSeats());
		//System.out.println("speed limit " + obj.getSpeedLimit() + " kmph");
		
		//we can update using setter
		obj.setSpeedLimit(120);
		System.out.println("speed limit " + obj.getSpeedLimit() + " kmph");
		
		obj.move();
		obj.honk();


	}

}
