package org.atheby.designpatterns.creational.builder;

public interface IShapeBuilder {
	
	public void setName();
	public void setBorder();
	public void setColor();
	public Shape getShape();
}
