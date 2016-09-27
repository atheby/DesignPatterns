package org.atheby.designpatterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shape) {
		switch (shape.toUpperCase()) {
			case "CIRCLE":
				return new Circle();
			case "RECTANGLE":
				return new Rectangle();
		}
		return null;
	}
	
	@Override
	public IType getType(String type) {
		return null;
	}
}
