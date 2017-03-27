package com.su.learn.facade;

public class ShapeMaker {
	
	private Shape cirlce;
	
	private Shape square;
	
	private Shape rectangle;
	
	public ShapeMaker() {
		
		cirlce = new Circle();
		rectangle = new Rectangle();
		square = new Square();
		
	}
	
	public void drawCircle(){
		cirlce.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}

	public void drawSquare(){
		square.draw();
	}
}
