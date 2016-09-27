package org.atheby.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
	
	private int state;
	private List<IObserver> observers = new ArrayList<IObserver>();
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyObservers(state);
	}
	
	@Override
	public void register(IObserver obs) {
		observers.add(obs);
	}
	
	@Override
	public void unregister(IObserver obs) {
		observers.remove(obs);
	}
	
	@Override
	public void notifyObservers(int s) {
		for(IObserver obs: observers)
			obs.update(s);
	}
}
