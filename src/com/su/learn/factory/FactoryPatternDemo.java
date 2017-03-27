package com.su.learn.factory;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape("circle");
		shape.draw();
		Shape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("square");
		shape3.draw();
		
	}

}
