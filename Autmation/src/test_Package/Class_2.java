package test_Package;

import java.util.Iterator;
import java.util.TreeSet;

public class Class_2 {
	
	public static void main(String[] args) {
		
		int Arry []= {10,30,50,10,40,20,70,50};
		
		TreeSet t = new TreeSet();
		
		TreeSet t2 = new TreeSet();
		
		for (int i = 0; i < Arry.length; i++) {
			
			Boolean b =t.add(i);
			
			if(b==false) {
				
				t2.add(i);
			}
			if(t.contains(i)) {
				
				t.remove(i);
				
			}
		}
//		for(int a : t) {
//			
//			System.out.println(a);
//		}
//		
	}

}
