package com.su.learn.abstractfactory;

import com.su.learn.abstractfactory.color.Color;
import com.su.learn.abstractfactory.shape.Shape;

public abstract class AbstractFactory {

	abstract Shape getShape(String shapeName);

	abstract Color getColor(String colorName);

}
