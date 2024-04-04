package com.oops.composition;

public class Car {
    private Engine engine;

	public Car(Engine engine) {
		//super(); why
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
