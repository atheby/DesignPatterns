package org.atheby.designpatterns.structural.decorator;

public class FilledShapeDecorator extends AbstractDecorator {
	
	public FilledShapeDecorator(IShape shape) {
		super(shape);
	}
	
	@Override
	public void draw() {
		super.draw();
		fillOut(shape);
	}

	public void fillOut(IShape shape) {
		System.out.println("Filled");
	}
}
