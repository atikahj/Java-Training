package com.atik.sample;

class OuterClass {

	private class InnerClass {
		public void print() {
			System.out.println("This is an inner class");
		}
	}
	
	public class InnerClass2 {
		public void print() {
			System.out.println("This is an inner class 2");
		}
	}
	
	void myMethod() {
		
		class InnerClass3 {
			public void print() {
				System.out.println("This is an inner class 3 inside MyMethod");
			}
		}
		
		InnerClass3 inner = new InnerClass3();
		inner.print();
	}
	
	void displayInner() {
		InnerClass inner = new InnerClass();
		inner.print();
	}
}


