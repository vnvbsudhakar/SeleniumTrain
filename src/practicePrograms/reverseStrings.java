package practicePrograms;

public class reverseStrings {
	
	public static void main(String[] args) {
		
		String input = "This      is my     office   laptop"; // o/p should be "laptop office my is this"
		String output = reverseOf(input);
		System.out.println(output);
	}
	
	public static String reverseOf(String input) {
		String reverse = "";
		String[] strArray = input.split("\\s+"); //{"This", "is", "a", "my", "office", "laptop"}
		for (String word: strArray) {
			reverse = word + " " + reverse;
			System.out.println(reverse);
		}
		//1st loop: "this "
		//2nd loop: "is this "
		//3rd loop: "a is this "
		//4th loop: "my a is this "
		//5th loop: "office my a is this "
		//6th loop: "laptop office my a is this "
		return reverse.trim();
		
		
		
		
		
		
		
	}
}
