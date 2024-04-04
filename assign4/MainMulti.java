package com.oops.assign4;

public class MainMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication mul=new Multiplication();
		//mul.a=10;
		//mul.b=20;
		//mul.c=30;
		//mul.d=40; its ok values assigning.
		System.out.println(mul.MultiplyNumbers(10,20));
		System.out.println(mul.MultiplyNumbers(10, 20,30));
		System.out.println(mul.MultiplyNumbers(10, 20,30,40));

	}

}
