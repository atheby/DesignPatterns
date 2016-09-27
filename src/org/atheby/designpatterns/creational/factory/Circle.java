package org.atheby.designpatterns.creational.factory;

public class Circle implements IShape {
	
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
