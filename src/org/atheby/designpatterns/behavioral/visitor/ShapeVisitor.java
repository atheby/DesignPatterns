package org.atheby.designpatterns.behavioral.visitor;

public class ShapeVisitor implements IShapeVisitor {

	@Override
	public void visit(Circle circle) {
		System.out.println(circle.getName());
	}

	@Override
	public void visit(Rectangle rectangle) {
		System.out.println(rectangle.getName());
	}
}
