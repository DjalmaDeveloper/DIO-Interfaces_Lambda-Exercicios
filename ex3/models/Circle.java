package models;

import interfaces.Shape;

public class Circle implements Shape {
	
	private final double pi = Math.PI;
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return pi * (Math.pow(radius, 2));
	}

}
