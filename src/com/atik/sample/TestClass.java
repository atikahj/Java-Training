package com.atik.sample;

public class TestClass implements Inf2 {

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return "I am test class";
	}

	@Override
	public void testIt() {
		// TODO Auto-generated method stub

		System.out.println("Test it");
	}
	
	public static void main(String args[]) {
		
		System.out.println("Inside Test Class");
		System.out.println(name);
		TestClass test = new TestClass();
		test.testIt();
		System.out.println(Inf2.name);
		
		//Inf1 obj = New TestClass();
		
		//System.out.println(obj.whoAmI());
		//obj.testIt();
		
	}


}
