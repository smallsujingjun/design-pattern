package com.su.learn.chain;

public class ErrorLogger extends AbstractLogger {
	
	public ErrorLogger(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}

	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Standard Error::Logger:" + message);
	}

}
