package com.su.learn.abstractfactory;

import com.su.learn.abstractfactory.color.Blue;
import com.su.learn.abstractfactory.color.Color;
import com.su.learn.abstractfactory.color.Green;
import com.su.learn.abstractfactory.color.Red;
import com.su.learn.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String colorName) {
		// TODO Auto-generated method stub
		if (colorName == null || "".equals(colorName)) {
			return null;
		}
		if ("red".equalsIgnoreCase(colorName)) {
			return new Red();
		} else if ("green".equalsIgnoreCase(colorName)) {
			return new Green();
		} else if ("blue".equalsIgnoreCase(colorName)) {
			return new Blue();
		}
		return null;
	}

}
