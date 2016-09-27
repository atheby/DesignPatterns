package org.atheby.designpatterns.creational.builder;

public class Circle implements IShapeBuilder {

	private Shape shape;
	
	public Circle() {
		shape = new Shape();
	}
	
	@Override
	public void setName() {
		shape.add("Circle");
	}
	
	@Override
	public void setBorder() {
		shape.add("Dotted");
	}

	@Override
	public void setColor() {
		shape.add("Red");
	}

	@Override
	public Shape getShape() {
		return shape;
	}
}
