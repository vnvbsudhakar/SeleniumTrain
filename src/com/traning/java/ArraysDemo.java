package com.traning.java;

import java.lang.reflect.Array;
import java.util.*;

public class ArraysDemo {
	
	public static void main(String[] args) {
		int[] intArray;
		intArray = new int[10];
		
//		intArray[0] = 100;
//		intArray[1] = 101;
//		intArray[2] = 101;
//		intArray[3] = 101;
//		intArray[4] = 101;
//		intArray[5] = 101;
//		intArray[6] = 101;
//		intArray[7] = 101;
//		intArray[8] = 101;
//		intArray[9] = 101;
//		
//		
//		
//		System.out.println(intArray[0]);
//		System.out.println(intArray[1]);
//		System.out.println(intArray[2]);
//		System.out.println("____________");
//		
//		for(int i = 0; i < intArray.length; i++) {			//for(int i =0; i < 10; i++)
//			System.out.println(intArray[i]);				// loop1: it is intArray[0] - o/p: 100
//															// loop2: it is intArray[1] - o/p: 101
//															// loop3: it is intArray[2] - o/p: 
//		}
//		
//		System.out.println("____________");
//		
//		for(int i = 0; i < intArray.length; i++) {
//			intArray[i] = i*i;
//			// intArray[0] = 100;
//		}
//		
//		for(int i = 0; i < intArray.length; i++) {
//			System.out.println(intArray[i]);
//		}
//		
		System.out.println(intArray);
//		
//		int count = 10;
//		
//		count = 20;
//		
//		System.out.println("count is :   " + count);
		
		
		
		intArray[0] = 100;
		intArray[1] = 101;
		intArray[2] = 90;
		intArray[3] = 63;
		intArray[4] = 11;
		intArray[5] = 1201;
		intArray[6] = 781;
		intArray[7] = 981;
		intArray[8] = 3451;
		intArray[9] = 12345;
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		Arrays.sort(intArray);
		System.out.println("____________");
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		String[] planes = {"Boeing", "Airbus", "MADA", "AirIndia"};
		
		String[][] cars = {{"BMW", "Merc", "Ferari"},{"VW", "Fiat", "Maruti"}};
		
		System.out.println(cars);
		
		char[][][] ch = {{},{},{}};
		System.out.println(ch);
		
		
		
	}

}
