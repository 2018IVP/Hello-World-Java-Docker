package org.pictolearn.docker;

public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 1 ; true; i++){
			System.out.println("Kiran Ping  - Never stops" + i );
			Thread.sleep(1000);
		}
	}
}
