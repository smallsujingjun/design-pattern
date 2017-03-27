package com.su.learn.prototype;

import java.util.Hashtable;

public class ShapeCache {
	
	private static Hashtable<String, Shape> cacheShape = new Hashtable<String, Shape>();
	
	public static Shape getShape(String id){
		Shape shape = cacheShape.get(id);
		return (Shape) shape.clone();
	}
	
	public static void loadCache(){
		Square square = new Square();
		square.setId("1");
		cacheShape.put(square.getId(), square);
		
		Circle circle = new Circle();
		circle.setId("2");
		cacheShape.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		cacheShape.put(rectangle.getId(), rectangle);
	}

}
