package com.su.learn.factory;
/**
 * 产出形状实例的工厂
 * @author Administrator
 *
 */
public class ShapeFactory {

	public Shape getShape(String shapeName) {

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
}
