package com.atik.sample;

public class ThreadTest extends Thread {
	
	public void run(){  
		System.out.println("I am new thread running");  
	}  
	
	public static void main(String args[]){  
		
		ThreadTest t1=new ThreadTest();  
		ThreadTest t2=new ThreadTest();
		ThreadTest t3=new ThreadTest();
		ThreadTest t4=new ThreadTest();
		ThreadTest t5=new ThreadTest();
		
		t1.start();  
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}  
}
