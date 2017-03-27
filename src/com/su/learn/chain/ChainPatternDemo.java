package com.su.learn.chain;


public class ChainPatternDemo {
	
	public static AbstractLogger getAbstractLogger(){
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args) {
		
		AbstractLogger logger = getAbstractLogger();
		
		logger.logMessage(AbstractLogger.ERROR, "This is an Error information.");
		System.out.println("=====================");
		
		logger.logMessage(AbstractLogger.DEBUG, "This is an Debug information.");
		System.out.println("=====================");
		
		logger.logMessage(AbstractLogger.INFO, "This is an information.");
		
	}

}
