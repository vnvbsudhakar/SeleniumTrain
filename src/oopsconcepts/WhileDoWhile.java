package oopsconcepts;

public class WhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		while(i<20) {
			// continue and break
			i++;
			if(i==16) {
				continue;
			}
			System.out.println("Index of i is: " + i);
		}
		
		do {
				System.out.println("Index of i is: " + i);
		}while(i>20);

	}

}
