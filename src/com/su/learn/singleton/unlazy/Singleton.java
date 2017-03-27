package com.su.learn.singleton.unlazy;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		return instance;
	}

}

class Singleton1{
	private static final class SingletonHolder{
		private static Singleton1 instance = new Singleton1();
	}
	
	private Singleton1(){}
	
	public static final Singleton1 getInstance(){
		return SingletonHolder.instance;
	}
}