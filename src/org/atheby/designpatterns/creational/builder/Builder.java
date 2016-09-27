package org.atheby.designpatterns.creational.builder;

public class Builder {
	
	private IShapeBuilder builder;
	
	public void build(IShapeBuilder builder) {
		this.builder = builder;
		builder.setName();
		builder.setBorder();
		builder.setColor();
	}
}
