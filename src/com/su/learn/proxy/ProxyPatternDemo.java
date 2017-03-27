package com.su.learn.proxy;

public class ProxyPatternDemo {
	
	public static void main(String[] args) {
		Image image = new ProxyImage("imi.jpg");
		
		image.display();
		System.out.println("===============");
		image.display();
	}

}
