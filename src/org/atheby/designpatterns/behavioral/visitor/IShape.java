package org.atheby.designpatterns.behavioral.visitor;

public interface IShape {
	
	public void accept(ShapeVisitor sv);
	public String getName();
}
