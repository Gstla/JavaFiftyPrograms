package com.oops;

/*a. Write a program creating an abstract class Shape with properties 
(noOfSides,area,perimeter) and methods(calculateArea,calculatePerimeter,setSides.*/

public abstract class Shape {
	
	int noOfSides; 
	double area;
	double perimeter;
	
	public abstract double calculateArea(double r);
	
	public abstract double caluculatePerimeter(double r);
	
	public abstract void setSides();

}
