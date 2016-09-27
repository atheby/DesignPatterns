package org.atheby.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Shape {
	
	private String name;
	private String color;
	private String border;
	private List<Shape> shapes;
	
	public Shape(String name, String color, String border) {
		this.name = name;
		this.color = color;
		this.border = border;
		shapes = new ArrayList<Shape>();
	}
	
	public void add(Shape shape) {
		shapes.add(shape);
	}
	
	public List<Shape> getAllShapes() {
		return shapes;
	}
	
	public String getValues() {
		return name + " " + color + " " + border;
	}
}
