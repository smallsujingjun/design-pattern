package com.su.learn.proxy;

public class RealImage implements Image {
	
	private String fileName;
	
	

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}



	private void loadFromDisk(String fileName) {
		
		System.out.println("loadFromDisk:" + fileName);
		
	}



	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("display:" + fileName);

	}

}
