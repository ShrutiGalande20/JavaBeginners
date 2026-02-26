//package com.shruti.demo;
//
//class ClassStudent{
//	String name;
//	int marks;
//	
//	public void result() {
//		if(marks >= 35) {
//			System.out.println(name+ " Pass");
//		}else {
//			System.out.println(name+ " Fail");
//		}
//	}
//	
//}
//
//public class Student {
//
//	public static void main(String[] args) {
//		ClassStudent c1 = new ClassStudent();
//		ClassStudent c2 = new ClassStudent();
//		
//		c1.name="Syam";
//		c1.marks=34;
//		
//		c2.name="teddy";
//		c2.marks=35;
//		
//		c1.result();
//		c2.result();
//		
//		System.out.println(c1.name);
//		
//	}
//
//}


//Encapsulation
package com.shruti.demo;

class ClassStudent{
	private String name;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
}

public class Student {

	public static void main(String[] args) {
		ClassStudent c1 = new ClassStudent();
		
		
		c1.setName("shru");
		
		
		System.out.println(c1.getName());
		
	}

}
