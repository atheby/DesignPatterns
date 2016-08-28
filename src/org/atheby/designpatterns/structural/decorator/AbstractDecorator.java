package org.atheby.designpatterns.structural.decorator;

public abstract class AbstractDecorator implements IShape{
	
	protected IShape shape;
	
	public AbstractDecorator(IShape shape) {
		this.shape = shape;
	}
	
	@Override
	public void draw() {
		shape.draw();
	}
}
