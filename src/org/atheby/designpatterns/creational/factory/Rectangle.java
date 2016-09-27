package org.atheby.designpatterns.creational.factory;

public class Rectangle implements IShape {
	
	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}
