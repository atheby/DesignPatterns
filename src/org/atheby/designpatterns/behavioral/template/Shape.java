package org.atheby.designpatterns.behavioral.template;

public abstract class Shape {
	
	public void draw() {
		position();
		color();
		size();
	}
	private void position() {
		System.out.println("Position");
	}
	private void color() {
		System.out.println("Color");
	}
	public abstract void size();
}
