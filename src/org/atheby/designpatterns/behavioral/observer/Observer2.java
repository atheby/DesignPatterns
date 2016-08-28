package org.atheby.designpatterns.behavioral.observer;

public class Observer2 implements IObserver{

	@Override
	public void update(int s) {
		System.out.println("Observer2: state's value " + s);
	}

}
