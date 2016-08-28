package org.atheby.designpatterns.structural.decorator;

public class Circle implements IShape{
	
	@Override
	public void draw(){
		System.out.println("Circle");
	}
}
