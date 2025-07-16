package models;

import interfaces.Shape;

public class Square implements Shape {

	private double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}
	
	@Override
	public double area() {
		return side * side;
	}	

}
