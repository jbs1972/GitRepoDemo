package com.jbs.model;

public class SingletoneClass {
	private static int counter;
	private static SingletoneClass ref;
	static {
		counter = 0;
	}
	private SingletoneClass() {
		super();
	}
	public static int getCounter() {
		return counter;
	}
	public static SingletoneClass getSingletoneClass() {
		if(ref == null) {
			ref = new SingletoneClass();
		} else {
			counter++;
		}
		return ref;
	}
}
