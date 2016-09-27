package org.atheby.designpatterns.creational.abstractfactory;

public class Solid implements IType {
	
	@Override
	public void border() {
		System.out.println("Solid");
	}
}
