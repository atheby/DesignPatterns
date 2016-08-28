package org.atheby.designpatterns.structural.proxy;

public class Shape implements IShape {
	
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.println("Shape's color: " + color);
	}
}
