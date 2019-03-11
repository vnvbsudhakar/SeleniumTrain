package com.traning.java;

public class DataTypes {
	
	static byte byteStaticVar;
	static short shortStaticVar;
	static int intStaticVar;
	static long longStaticVar;
	static float floatStaticVar;
	static double doubleStaticVar;
	static boolean boolStaticVar;
	static char charStaticVar;
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("byte from global: "+ byteStaticVar);
		System.out.println("short from global: "+ shortStaticVar);
		System.out.println("int from global: "+ intStaticVar);
		System.out.println("long from global: "+ longStaticVar);
		System.out.println("float from global: "+ floatStaticVar);
		System.out.println("double from global: "+ doubleStaticVar);
		System.out.println("bool from global: "+ boolStaticVar);
		System.out.println("char from global: "+ charStaticVar);
		
		//they are the space holders to store the data
		//you cant use a variable before initialize a method
		//scope: create a different method and explain scope
		
		//concepts: syso of variables
		/*
		 * Byte
		 * Min: -128
		 * Max: 127
		 * Default: 0
		 * Delaration: byte
		 * concepts: Outside range, size/memory: 1byte in memory space
		 */
		byte bytevar;
		bytevar = 1;
		

		
		/*
		 * short
		 * Min: -32786
		 * Max: 32785
		 * Default: 0
		 * Delaration: short
		 */
		short s = 3456;
		System.out.println("short from main: " + s);
		
		
		/*
		 * Integer
		 * Min: -2147483648
		 * Max: 2147483647
		 * Default: 0
		 * Delaration: int
		 */
		int intVar = 10;
		System.out.println("integer from main:" + intVar);
		
		
		
		/*
		 * long
		 * Min: -2^63
		 * Max: 2^63-1
		 * Default: 0
		 * Delaration: long
		 */
		long longVar = 2147483649L;
		System.out.println("long from main: "+ longVar);
		
		
		/*
		 * float
		 * Default: 0
		 * Declaration: float
		 * Concepts: default . how system recgnize
		 */
		float floatVar = 2345.3456f;
		
		
		/*
		 * double
		 * Default: 0
		 * Declaration: double
		 */
		double doubleVar = 2345.456;
		System.out.println("double from main: "+ doubleVar);
		
				
		
		/*
		 * boolean
		 * values = true and false
		 * Default: false
		 * Delaration: bool
		 */
		boolean boolVar = true;
		System.out.println("bool from main: "+ boolVar);
		
		
		/*
		 * character
		 * values = 65536
		 * Default: 
		 * Delaration: char
		 */
		char ch = 15500;
		System.out.println("Char from main: "+ ch);
		
		
		

	}

}
