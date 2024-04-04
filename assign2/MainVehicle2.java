package com.oops.assign2;

public class MainVehicle2 {
	public static void main(String[] args) {
		Vehicle obj=new Vehicle("bike",80);
		obj.run();
		obj.honk();
		Car obj2=new Car("car",120);
		obj2.run();
		obj2.honk();
		Truck obj3=new Truck("truck", 100);
		obj3.run();
		obj3.honk();
		
		
	}

}
