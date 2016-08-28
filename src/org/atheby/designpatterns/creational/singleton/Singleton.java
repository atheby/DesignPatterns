package org.atheby.designpatterns.creational.singleton;

public class Singleton {
	
	private Singleton() {};
	
	private static class SingletonHelper {
		private static final Singleton singleton = new Singleton();
	}
	
	public static Singleton getSingleton() {
		return SingletonHelper.singleton;
	}
	
	public void message() {
		System.out.println("Singleton: Message from singleton");
	}
}
