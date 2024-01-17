package com.javaex.ex02;

public class DigitThread extends Thread {
	
	public void run() {
		for(int i=0; i<30; i++) {
			System.out.println(i);
		}
	}

}
