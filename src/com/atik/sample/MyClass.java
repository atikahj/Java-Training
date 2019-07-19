package com.atik.sample;

public class MyClass {
	
	public void displayMessage(Message m) {
		System.out.println(m.greet());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass outer = new OuterClass();
		
		outer.displayInner();
		
		outer.myMethod();
		
		OuterClass.InnerClass2 inner = outer.new InnerClass2();
		inner.print();
		
		MyClass obj = new MyClass();
		obj.displayMessage(new Message() {
			
			@Override
			public String greet() {
				// TODO Auto-generated method stub
				return "Hi";
			}
		});
	}

}
