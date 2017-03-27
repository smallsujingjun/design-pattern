package com.su.learn.singleton.lazy;
/**
 * 线程不安全
 * @author Administrator
 *
 */
public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}

class SingletonSafe{
	
	private static SingletonSafe instance = null;
	
	private SingletonSafe(){}
	
	public static synchronized SingletonSafe getInstance(){
		if(instance == null){
			
			instance = new SingletonSafe();
			
		}
		return instance;
		
	}
	
	
}
