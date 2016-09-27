package org.atheby.designpatterns.behavioral.visitor;

public class Circle implements IShape {

	@Override
	public void accept(ShapeVisitor sv) {
		sv.visit(this);	
	}
	
	@Override
	public String getName() {
		return "Circle";
	}
}
