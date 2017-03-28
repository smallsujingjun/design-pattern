package com.su.learn.decorator;

public abstract class ShapeDecorator implements Shape {
	
	protected Shape decoratorShape;
	
	

	public ShapeDecorator(Shape decoratorShape) {
		this.decoratorShape = decoratorShape;
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratorShape.draw();
	}

}
