package org.atheby.designpatterns.behavioral.visitor;

public interface IShapeVisitor {
	
	public void visit(Circle circle);
	public void visit(Rectangle rectangle);
}
