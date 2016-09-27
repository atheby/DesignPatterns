package org.atheby.designpatterns.behavioral.nullobject;

public class Circle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Circle");
	}
	
	@Override
	public boolean isNull() {
		return false;
	}
}
