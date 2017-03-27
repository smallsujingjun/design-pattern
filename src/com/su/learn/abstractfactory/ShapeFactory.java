package com.su.learn.abstractfactory;

import com.su.learn.abstractfactory.color.Color;
import com.su.learn.abstractfactory.shape.Circle;
import com.su.learn.abstractfactory.shape.Rectangle;
import com.su.learn.abstractfactory.shape.Shape;
import com.su.learn.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeName) {
		// TODO Auto-generated method stub
		if (shapeName == null || "".equals(shapeName)) {
			return null;
		}
		if ("circle".equalsIgnoreCase(shapeName)) {
			return new Circle();
		} else if ("rectangle".equalsIgnoreCase(shapeName)) {
			return new Rectangle();
		} else if ("square".equalsIgnoreCase(shapeName)) {
			return new Square();
		}

		return null;
	}

	@Override
	public Color getColor(String colorName) {
		// TODO Auto-generated method stub
		return null;
	}

}
