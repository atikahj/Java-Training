package com.atik.sample;

public final class FinalClass {

	static String className = "FinalClass";
	String className2 = "FinalClass";
	
	
	public static String getClassName() {
		return className;
	}

	public static void setClassName(String className) {
		FinalClass.className = className;
	}

	public String getClassName2() {
		return className2;
	}

	public void setClassName2(String className2) {
		this.className2 = className2;
	}

	public static void sayHi(String name) {
		System.out.println("Hi : " + name);
		
	}
	
	public void sayBye(String name) {
		System.out.println("Bye :" + name);
	}

}
