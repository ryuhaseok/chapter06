package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {

		DigitThread d = new DigitThread();
		d.start();
		
		for(char ch='A'; ch<='z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		
	}

}
