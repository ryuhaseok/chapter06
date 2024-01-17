package com.javaex.ex02;

public class LowerThread extends Thread {
	
	public void run() {
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
		}
	}
	

}
