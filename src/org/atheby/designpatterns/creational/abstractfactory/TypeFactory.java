package org.atheby.designpatterns.creational.abstractfactory;

public class TypeFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shape) {
		return null;
	}
	
	@Override
	public IType getType(String type) {
		switch (type.toUpperCase()) {
		case "SOLID":
			return new Solid();
		case "DOTTED":
			return new Dotted();
	}
	return null;
	}
}
