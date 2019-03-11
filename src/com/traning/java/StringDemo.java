package com.traning.java;

import com.google.common.hash.HashCode;

public class StringDemo {

	public static void main(String[] args) {
		String s0 = new String("JavaTraning");
		String s1 = "JavaTraning"; //string constant pool
		String s2 = new String("JavaStringTraning"); //Heap memory
		String s3 = new String("JavaStringTraning");
		String s4 = "JavaTraning"; //string constant pool
		String s5 = "         is going very well              ";
		String s6 = "";
		
		System.out.println("s1.equals(s4):    "+s1.equals(s4));//JavaTraning is stored in string constant pool and s1 and s4 are
																// pointed to same location
		System.out.println("s1.equals(s0):    "+s1.equals(s0));//S1 is in string constant pool and s2 is in heap memory
		System.out.println("s2.equals(s3):    "+s2.equals(s3));
		System.out.println(s1==s4);
		System.out.println(s1==s0);
		System.out.println(s2==s3);
		
		s0.concat("Class");
		System.out.println(s0);
		
		StringBuffer sb = new StringBuffer("JavaTraining");
		sb.append("Class");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("JavaTraining");
		sb1.append("Class");
		System.out.println(sb1);
		
		
//		String length() - length of the string 
		System.out.println("Length of S2: "+ s2.length());
//		String charAt() - returns a char value at the given index number 
		System.out.println("Char at 15th location of s5: "+ s5.charAt(15));
//		String concat() - combines specified string at the end of this string 
		System.out.println("concating s4 and s5: " + s4.concat(s5.trim()));
//		String contains() - returns true if chars are found in the string 
		System.out.println("To check if going is part of s5: "+ s5.contains("going"));
//		String startsWith() - checks if this string starts with given prefix
		System.out.println("To check if s4 starts with J: "+s4.startsWith("J"));
		System.out.println("To check if s4 starts with ava: "+s4.startsWith("ava"));
//		String endsWith() - checks if this string ends with given suffix 
		System.out.println("To check if s3 ends with java: "+ s3.endsWith("java"));
		System.out.println("To check if s3 ends with g: "+ s3.endsWith("g"));
//		String equals() - compares the contents of two given strings
		System.out.println("To check if s2 and s3 are same: "+ s2.equals(s3));
		System.out.println("To check if s2 and s3 are same: "+ s1.equals(s4));
//		String indexOf() - returns index of given character value or substring
		System.out.println("To check index of a in string: "+s4.indexOf("a"));
		System.out.println("To check index of n in string s4: "+s4.indexOf("n"));
//		String isEmpty() - checks if this string is empty 
		System.out.println("to check if s5 is empty or not: " + s5.isEmpty());
		System.out.println("to check if s6 is empty or not: " + s6.isEmpty());
//		String replace() - returns a string replacing all the old char to new char 
		System.out.println("To check replace a char or string in a string: "+ s5.replace(" ", "-"));
		String s7 = s5.replace(" ", "-");
//		System.out.println("trim s7: "+ s7.trim(-)); - Explanation pending
//		String substring() - returns a part of the string 
		System.out.println("taking sub string only with start index: "+ s4.substring(4));
		System.out.println("taking sub string with start and end index: "+ s4.substring(4, 9));
//		String toCharArray() - converts this string into character array 
		char[] charArray = s2.toCharArray();
		for(int i=0; i < charArray.length; i++) {
			System.out.println("character at "+ i + "location   ::::" + charArray[i]);
		}
		
//		String toLowerCase() - returns the string in lowercase letter
		System.out.println(s2.toLowerCase());
//		String toUpperCase() - returns the string in uppercase letter
		System.out.println(s2.toUpperCase());
//		String trim() - eliminates leading and trailing spaces
//		System.out.println(s5);
//		System.out.println(s5.trim());
		
		
		
		

	}

}
