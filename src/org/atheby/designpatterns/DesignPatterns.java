package org.atheby.designpatterns;

import org.atheby.designpatterns.behavioral.observer.Observer1;
import org.atheby.designpatterns.behavioral.observer.Observer2;
import org.atheby.designpatterns.behavioral.observer.Subject;
import org.atheby.designpatterns.behavioral.template.Shape;
import org.atheby.designpatterns.structural.decorator.FilledShapeDecorator;
import org.atheby.designpatterns.structural.decorator.IShape;
import org.atheby.designpatterns.structural.proxy.ProxyShape;
import org.atheby.designpatterns.creational.singleton.Singleton;

public class DesignPatterns {

	public static void main(String[] args) {
		
		/*
		 *  Singleton Pattern
		 */
		System.out.println("-- Singleton Pattern --");
		Singleton.getSingleton().message();
		System.out.println("----------");
		
		/*
		 *	Proxy Pattern
		 */
		
		System.out.println("-- Proxy Pattern --");
		ProxyShape proxy = new ProxyShape("red");
		proxy.draw();
		System.out.println("----------");
		
		/*
		 *	Observer Pattern
		 */
		System.out.println("-- Observer Pattern --");
		Subject sub = new Subject();
		Observer1 obs1 = new Observer1();
		Observer2 obs2 = new Observer2();
		
		sub.register(obs1);
		sub.register(obs2);
		
		sub.setState(10);
		
		sub.unregister(obs1);
		sub.setState(20);
		System.out.println("----------");
		
		/*
		 *	Decorator Pattern
		 */
		System.out.println("-- Decorator Pattern --");
		IShape circle = new org.atheby.designpatterns.structural.decorator.Circle();
		IShape filledCircle = new FilledShapeDecorator(new org.atheby.designpatterns.structural.decorator.Circle());
		
		circle.draw();
		filledCircle.draw();
		System.out.println("----------");
		
		/*
		 *	Template Method Pattern
		 */
		System.out.println("-- Template Method Pattern --");
		Shape s = new org.atheby.designpatterns.behavioral.template.Circle();
		s.draw();
		s = new org.atheby.designpatterns.behavioral.template.Rectangle();
		s.draw();
		System.out.println("----------");
	}

}
