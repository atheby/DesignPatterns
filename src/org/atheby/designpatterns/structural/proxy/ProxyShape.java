package org.atheby.designpatterns.structural.proxy;

public class ProxyShape implements IShape {
	
	private Shape shape;
	private String color;
	
	public ProxyShape(String color) {
		this.color = color;
	}
	
	@Override
	public void draw() {
		if(shape == null)
			shape = new Shape(color);
		shape.draw();
	}
}
