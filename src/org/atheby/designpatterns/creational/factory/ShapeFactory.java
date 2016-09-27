package org.atheby.designpatterns.creational.factory;

public class ShapeFactory {

	public IShape getShape(String shape) {
		switch(shape.toUpperCase()) {
			case "CIRCLE":
				return new Circle();
			case "RECTANGLE":
				return new Rectangle();
		}
		return null;
	}
}
