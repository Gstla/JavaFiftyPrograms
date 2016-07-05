package com.oops;

public class Square extends Circle {
	
	public double calculateArea(double r) {
		
		double area = r * r;
		System.out.println("Area of Square is : " +area);
		return area;
	}
	
	public double calculateArea(double l, double b) {
		double area = l*b;
		System.out.println("Area of Rectangle is : " +area);
		return area;
	}


	public double caluculatePerimeter(double r) {
		double perimeter = 4* r;
		System.out.println("Perimeter of Square is : " +perimeter);
		return perimeter;
	}
	
	
	public double caluculatePerimeter(double l, double b) {
		double perimeter = 2*(l+b);
		System.out.println("Perimeter of Rectangle is : " +perimeter);
		return perimeter;
	}


	@Override
	public void setSides() {
		System.out.println(noOfSides);
		
	}


	public static void main(String[] args) {
		Square sq = new Square();
		sq.calculateArea(5);
		sq.calculateArea(5, 7.8);
		sq.caluculatePerimeter(5);
		sq.caluculatePerimeter(5, 7.8);

	}

}
