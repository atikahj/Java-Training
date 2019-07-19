package com.atik.sample;

import java.util.*;

public class UtilCheck {
	
	public static void main(String[] args){
		
		/* non generic
		List list = new ArrayList();
		list.add("Hello");
	
		String s = (String) list.get(0);*/
		
		//generic
		List <String> list = new ArrayList <String>();
		
		list.add("Hello");
		list.add("I");
		list.add("am");
		list.add("Java");
		list.add("ArrayList");
		
		//String s = list.get(0);
		
		/*for (String s : list) {
			System.out.print(s + " ");
		}*/
	
		//System.out.println("I got " + s);
		
		/*Iterator it = list.iterator();
		while (it.hasNext()){
			System.out.println(it.next() + " ");			
		}*/
		
		for (Iterator<?> it = list.iterator();it.hasNext();) {			
			String s = (String) it.next();
			if (s.equals("java")) {
				System.out.println("I got " + s);
			}
		}

	}
}
