package org.atheby.designpatterns.creational.abstractfactory;

public class FigureFactory {
	
	public AbstractFactory getFactory(String factory) {
		switch(factory.toUpperCase()) {
			case "SHAPE":
				return new ShapeFactory();
			case "TYPE":
				return new TypeFactory();
		}
		return null;
	}
}
