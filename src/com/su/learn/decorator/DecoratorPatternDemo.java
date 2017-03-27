package com.su.learn.decorator;

public class DecoratorPatternDemo {
	
	public static void main(String[] args) { 
		
		RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
		RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border.");
		new Circle().draw();
		
		System.out.println("Rectangle with normal border.");
		new Rectangle().draw();
		
		System.out.println("Circle with red border.");
		redCircle.draw();
		
		System.out.println("Rectangle with red border.");
		redRectangle.draw();
		
	}

}
