package org.atheby.designpatterns.behavioral.nullobject;

public class Null extends Shape {

	@Override
	public void draw() {
		System.out.println("Null object");
	}
	
	@Override
	public boolean isNull() {
		return true;
	}
}
