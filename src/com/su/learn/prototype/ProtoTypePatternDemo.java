package com.su.learn.prototype;

public class ProtoTypePatternDemo {
	
	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape shape = ShapeCache.getShape("1");
		System.out.println("shape:" + shape.getType());
		
		shape = ShapeCache.getShape("2");
		System.out.println("shape:" + shape.getType());
		
		shape = ShapeCache.getShape("3");
		System.out.println("shape:" + shape.getType());
		
	}

}
