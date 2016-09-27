package org.atheby.designpatterns.creational.abstractfactory;

public class Rectangle implements IShape{
	
	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}
