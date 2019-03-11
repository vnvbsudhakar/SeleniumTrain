package com.traning.java;

public class StringDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s0 = new String("JavaTraning");
		String s1 = "JavaTraning"; //string constant pool
		String s2 = new String("JavaStringTraning"); //Heap memory
		String s3 = new String("JavaStringTraning");
		String s4 = "JavaTraning"; //string constant pool
		String s5 = "         is going very well              ";
		String s6 = "";
		
//		System.out.println("s1.equals(s4):    "+s1.equals(s4));//JavaTraning is stored in string constant pool and s1 and s4 are
//																// pointed to same location
//		System.out.println("s1.equals(s0):    "+s1.equals(s0));//S1 is in string constant pool and s2 is in heap memory
//		System.out.println("s2.equals(s3):    "+s2.equals(s3));
//		System.out.println(s1==s4);
//		System.out.println(s1==s0);
//		System.out.println(s2==s3);
		
		System.out.println(s0);
		System.out.println(s0.hashCode());
		s0 = s0.concat("Class");
		System.out.println(s0);
		System.out.println(s0.hashCode());
		
		
		
		StringBuffer sb = new StringBuffer("JavaTraining");
		System.out.println("before append:::::::"+ sb);
		System.out.println(sb.hashCode());
		sb.append("Class");
		System.out.println("After append:::::::"+sb);
		System.out.println(sb.hashCode());
		
		
		StringBuilder sb1 = new StringBuilder("JavaTraining");
		System.out.println("before append:::::::"+ sb1);
		System.out.println(sb1.hashCode());
		sb1.append("Class");
		System.out.println("After append:::::::"+sb1);
		System.out.println(sb1.hashCode());
		
		
		
		
		
	}

}
