package com.oops.composition;
//Composition in Java is a design principle where a class contains an object 
//of another class as one of its instance variables.
public class Engine {
	private int horsepower;
    private String fuelType;
	public Engine(int horsepower, String fuelType) {
		super();
		this.horsepower = horsepower;
		this.fuelType = fuelType;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
    
}
