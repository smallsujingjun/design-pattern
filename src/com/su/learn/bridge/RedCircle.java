package com.su.learn.bridge;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("draw circle [ color:red," + "radius:" + radius + ",x:" + x + ",y:" + y +"]");
		
	}

}
