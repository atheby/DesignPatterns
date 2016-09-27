package org.atheby.designpatterns.creational.builder;

public class Rectangle implements IShapeBuilder {

	private Shape shape;
	
	public Rectangle() {
		shape = new Shape();
	}
	
	@Override
	public void setName() {
		shape.add("Rectangle");
	}
	
	@Override
	public void setBorder() {
		shape.add("Solid");
	}

	@Override
	public void setColor() {
		shape.add("Blue");
	}

	@Override
	public Shape getShape() {
		return shape;
	}
}
