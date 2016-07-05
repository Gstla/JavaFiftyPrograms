package com.oops;

/*c. Write a program that creates a class Circle extending Shape abstract class 
and implementing ShapeConstants interface and has following behavior.
1) Properties: radius.
2) Constructor: To set number of sides.
3) Overrides all the methods from parents.*/

public class Circle extends Shape implements ShapeConstants{
	
	public double radius;
	public Circle()
	{
		this.noOfSides = 0;
	}
	

	
	@Override
	public double calculateArea(double r) {
	
		double area = ShapeConstants.pi * r * r;
		System.out.println("Area of Circle is : " +area);
		return area;
	}

	@Override
	public double caluculatePerimeter(double r) {
		double perimeter = 2* ShapeConstants.pi * r;
		System.out.println("Perimeter of Circle is : " +perimeter);
		return perimeter;
	}

	@Override
	public void setSides() {
		System.out.println(noOfSides);
		
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		c.calculateArea(3);
		c.caluculatePerimeter(3);

	}
}
