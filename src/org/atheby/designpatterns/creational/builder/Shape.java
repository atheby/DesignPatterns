package org.atheby.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Shape {

	private List<String> shapes;
	
	public Shape() {
		shapes = new ArrayList<String>();
	}
	
	public void add(String shape) {
		shapes.add(shape);
	}
	
	public void draw() {
		for(String shape : shapes)
			System.out.println(shape);
	}
}
