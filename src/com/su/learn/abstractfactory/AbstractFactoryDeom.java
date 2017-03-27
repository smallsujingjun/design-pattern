package com.su.learn.abstractfactory;

import com.su.learn.abstractfactory.color.Color;
import com.su.learn.abstractfactory.shape.Shape;


public class AbstractFactoryDeom {
	
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
		
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		
		Shape square = shapeFactory.getShape("square");
		square.draw();
		//===================================================================
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color red = colorFactory.getColor("red");
		red.fill();
		
		Color green = colorFactory.getColor("green");
		green.fill();
		
		Color blue = colorFactory.getColor("blue");
		blue.fill();
	}

}
