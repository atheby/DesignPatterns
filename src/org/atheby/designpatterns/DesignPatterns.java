package org.atheby.designpatterns;

public class DesignPatterns {

	public static void main(String[] args) {
		
		/*
		 *  Null Object Pattern
		 */
		
		System.out.println(" -- Null Object Pattern --");
		org.atheby.designpatterns.behavioral.nullobject.ShapeFactory shapeF = new org.atheby.designpatterns.behavioral.nullobject.ShapeFactory();
		shapeF.getShape("CIRCLE").draw();
		shapeF.getShape("RECTANGLE").draw();
		System.out.println("----------");
		
		/*
		 *	Observer Pattern
		 */
		System.out.println("-- Observer Pattern --");
		org.atheby.designpatterns.behavioral.observer.Subject sub = new org.atheby.designpatterns.behavioral.observer.Subject();
		org.atheby.designpatterns.behavioral.observer.Observer1 obs1 = new org.atheby.designpatterns.behavioral.observer.Observer1();
		org.atheby.designpatterns.behavioral.observer.Observer2 obs2 = new org.atheby.designpatterns.behavioral.observer.Observer2();
		
		sub.register(obs1);
		sub.register(obs2);
		
		sub.setState(10);
		
		sub.unregister(obs1);
		sub.setState(20);
		System.out.println("----------");
		
		/*
		 *	Template Method Pattern
		 */
		System.out.println("-- Template Method Pattern --");
		org.atheby.designpatterns.behavioral.template.Shape shapeTemplate = new org.atheby.designpatterns.behavioral.template.Circle();
		shapeTemplate.draw();
		shapeTemplate = new org.atheby.designpatterns.behavioral.template.Rectangle();
		shapeTemplate.draw();
		System.out.println("----------");
		
		/*
		 *  Visitor Pattern
		 */
		System.out.println("-- Visitor Pattern --");
		org.atheby.designpatterns.behavioral.visitor.Circle circleVis = new org.atheby.designpatterns.behavioral.visitor.Circle();
		org.atheby.designpatterns.behavioral.visitor.Rectangle rectangleVis = new org.atheby.designpatterns.behavioral.visitor.Rectangle();
		org.atheby.designpatterns.behavioral.visitor.IShapeVisitor sv = new org.atheby.designpatterns.behavioral.visitor.ShapeVisitor();
		sv.visit(circleVis);
		sv.visit(rectangleVis);
		System.out.println("----------");
		
		/*
		 * 	Abstract Factory Pattern
		 */
		System.out.println("-- Abstract Factory pattern --");
		org.atheby.designpatterns.creational.abstractfactory.FigureFactory figureFactory = new org.atheby.designpatterns.creational.abstractfactory.FigureFactory();
		org.atheby.designpatterns.creational.abstractfactory.AbstractFactory shapeFactory = figureFactory.getFactory("shape");
		org.atheby.designpatterns.creational.abstractfactory.AbstractFactory typeFactory = figureFactory.getFactory("type");
		org.atheby.designpatterns.creational.abstractfactory.IShape circleAbstract = shapeFactory.getShape("circle");
		org.atheby.designpatterns.creational.abstractfactory.IType typeAbstract = typeFactory.getType("solid");
		circleAbstract.draw();
		typeAbstract.border();
		System.out.println("----------");
		
		/*
		 *  Builder Pattern
		 */
		
		System.out.println("-- Builder Pattern --");
		org.atheby.designpatterns.creational.builder.Builder builder = new org.atheby.designpatterns.creational.builder.Builder();
		org.atheby.designpatterns.creational.builder.IShapeBuilder circleB = new org.atheby.designpatterns.creational.builder.Circle();
		org.atheby.designpatterns.creational.builder.IShapeBuilder rectangleB = new org.atheby.designpatterns.creational.builder.Rectangle();
		builder.build(circleB);
		builder.build(rectangleB);
		circleB.getShape().draw();
		rectangleB.getShape().draw();
		System.out.println("----------");
		
		/*
		 *  Factory Method Pattern
		 */
		System.out.println("-- Factory Method Pattern --");
		org.atheby.designpatterns.creational.factory.ShapeFactory sf = new org.atheby.designpatterns.creational.factory.ShapeFactory();
		org.atheby.designpatterns.creational.factory.IShape circleFactory = sf.getShape("Circle");
		org.atheby.designpatterns.creational.factory.IShape rectangleFactory = sf.getShape("Rectangle");
		circleFactory.draw();
		rectangleFactory.draw();
		System.out.println("----------");
		
		/*
		 *  Singleton Pattern
		 */
		System.out.println("-- Singleton Pattern --");
		org.atheby.designpatterns.creational.singleton.Singleton.getSingleton().message();
		System.out.println("----------");
		
		/*
		 *  Composite Pattern
		 */
		
		System.out.println("-- Composite Pattern --");
		org.atheby.designpatterns.structural.composite.Shape shape = new org.atheby.designpatterns.structural.composite.Shape("All", "All", "All");
		org.atheby.designpatterns.structural.composite.Shape circle = new org.atheby.designpatterns.structural.composite.Shape("Circles", "All", "All" );
		org.atheby.designpatterns.structural.composite.Shape rectangle = new org.atheby.designpatterns.structural.composite.Shape("Rectangles", "All", "All" );
		org.atheby.designpatterns.structural.composite.Shape circleRed = new org.atheby.designpatterns.structural.composite.Shape("Circle1", "Red", "Dotted" );
		org.atheby.designpatterns.structural.composite.Shape circleBlue = new org.atheby.designpatterns.structural.composite.Shape("Circle2", "Blue", "Solid" );
		org.atheby.designpatterns.structural.composite.Shape rectangleYellow = new org.atheby.designpatterns.structural.composite.Shape("Rectangle1", "Yellow", "Solid" );
		org.atheby.designpatterns.structural.composite.Shape rectangleBlue = new org.atheby.designpatterns.structural.composite.Shape("Rectangle2", "Black", "Solid" );
		circle.add(circleRed);
		circle.add(circleBlue);
		rectangle.add(rectangleBlue);
		rectangle.add(rectangleYellow);
		shape.add(circle);
		shape.add(rectangle);
		for(org.atheby.designpatterns.structural.composite.Shape sh : shape.getAllShapes()) {
			System.out.println(sh.getValues());
			for(org.atheby.designpatterns.structural.composite.Shape subSh : sh.getAllShapes()) {
				System.out.println(subSh.getValues());
			}
		}
		System.out.println("----------");
		
		/*
		 *	Decorator Pattern
		 */
		System.out.println("-- Decorator Pattern --");
		org.atheby.designpatterns.structural.decorator.IShape circleDecorator = new org.atheby.designpatterns.structural.decorator.Circle();
		org.atheby.designpatterns.structural.decorator.IShape filledCircleDecorator = 
				new org.atheby.designpatterns.structural.decorator.FilledShapeDecorator(new org.atheby.designpatterns.structural.decorator.Circle());
		
		circleDecorator.draw();
		filledCircleDecorator.draw();
		System.out.println("----------");
		
		/*
		 *	Proxy Pattern
		 */
		System.out.println("-- Proxy Pattern --");
		org.atheby.designpatterns.structural.proxy.ProxyShape proxy = new org.atheby.designpatterns.structural.proxy.ProxyShape("red");
		proxy.draw();
		System.out.println("----------");
	}

}
