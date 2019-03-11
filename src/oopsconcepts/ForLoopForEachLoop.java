package oopsconcepts;

public class ForLoopForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (intilization; boolean-condition; Increment/decrement) {
//			
//		}
		
		int[]	intArray1 = {30, 27, 35, 12, 23, 56, 45};
		for(int i=1; i<intArray1.length; i++) {
			System.out.println(intArray1[i-1]);
			//loop1: intArray1[0] = 30
			//loop2: intArray1[1] = 27
		}
		
		
		int[]	intArray = {30, 27, 35, 12, 23, 56, 45};
		for(int i=intArray.length; i>0; i--) {
			System.out.println(intArray[i-1]);
		}
		
		for(int i: intArray) {
			System.out.println(i);
		}
//		
//		String str1 = "I Love India";
//		char[] charArray = str1.toCharArray();
//		for (int i=0; i<charArray.length; i++) {
//			System.out.println(charArray[i]);
//		}
		
		
		String[] strArray = {"India", "USA", "UAE", "UK", "SG", "Malasiya", "AUS", "Swiss", "Japan", "Indo", "China", "Korea"};
		for(String value: strArray) {
			System.out.println(value);
		}
		
	}

}
