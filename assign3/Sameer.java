package com.oops.assign3;

public class Sameer extends Man {
	String bloodGp;
	public Sameer(String name,String bloodGp) {
		super(name);
		this.bloodGp=bloodGp;
		// TODO Auto-generated constructor stub
	}
	public void printInfo() {
		System.out.println("name is "+name+" bloodGroup is "+ bloodGp);
	}

}
