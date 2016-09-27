package org.atheby.designpatterns.creational.abstractfactory;

public class Circle implements IShape{
	
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
