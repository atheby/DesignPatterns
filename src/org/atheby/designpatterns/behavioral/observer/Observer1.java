package org.atheby.designpatterns.behavioral.observer;

public class Observer1 implements IObserver{

	@Override
	public void update(int s) {
		System.out.println("Observer1: state's value " + s);
	}

}
