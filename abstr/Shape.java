package com.oops.abstr;

abstract class Shape {
	// A process of hiding the implementation details(unnecessary details) and showing only
	//functionality to the user.
	// It shows only relevant details of objects to the user and also reduces program
	//complexity (modularity).
	
	abstract double calculateArea();
	abstract double calculatePerimeter();

}
