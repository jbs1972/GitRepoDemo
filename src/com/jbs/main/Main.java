package com.jbs.main;

import com.jbs.model.SingletoneClass;

public class Main {
	public static void main(String[] args) {
//		SingletoneClass ref = new SingletoneClass();
		SingletoneClass ref = SingletoneClass.getSingletoneClass();
		System.out.println("Initial Counter value = "+ref.getCounter());
		for(int i=0; i<5; i++) {
			ref = SingletoneClass.getSingletoneClass();
			System.out.printf("\nInitial Counter value = %d", ref.getCounter());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}