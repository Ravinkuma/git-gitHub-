package com.oops.composition;

public class MainComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Engine en=new Engine(200,"petrol");
           Car c=new Car(en);
           System.out.println("Horsepower of car: " + c.getEngine().getHorsepower());
           System.out.println("Fuel Type of car: " + c.getEngine().getFuelType());
	}

}
