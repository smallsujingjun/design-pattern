package com.su.learn.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryName) {
		if (factoryName == null || "".equals(factoryName)) {
			return null;
		}
		if ("shape".equalsIgnoreCase(factoryName)) {
			return new ShapeFactory();
		} else if ("color".equalsIgnoreCase(factoryName)) {
			return new ColorFactory();
		}
		return null;
	}

}
