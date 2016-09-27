package org.atheby.designpatterns.creational.abstractfactory;

public abstract class AbstractFactory {
	
	public abstract IShape getShape(String shape);
	public abstract IType getType(String type);
}
