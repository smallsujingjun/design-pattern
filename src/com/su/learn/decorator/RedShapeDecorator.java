package com.su.learn.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratorShape) {
		super(decoratorShape);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratorShape.draw();
		setRedBorder(decoratorShape);
	}
	
	private void setRedBorder(Shape decoratorShape){
		System.out.println("Border color:red.");
	}

}
