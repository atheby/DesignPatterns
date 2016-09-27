package org.atheby.designpatterns.behavioral.nullobject;

public class ShapeFactory {

	public Shape getShape(String shape) {
		switch(shape.toUpperCase()) {
			case "CIRCLE":
				return new Circle();
			default:
				return new Null();
		}
	}
}
