package oopsconcepts;

public class MethodsDemo1 {


	public static void main(String[] args) {
//		this is a direct way
		int score= 89;
		String studentName = "Sudhakar";
		char grade;
		if(score >=90 && score <=100) {						//if(score = 100)
			grade = 'A';									//if(score == 100)
		}else if(score >= 80 && score<90) {
			grade = 'B';
		}else if(score >= 70 && score<80) {
			grade ='C';
		}else {
			grade = 'D';
		}
		System.out.println("Student "+ studentName + " Grade is " + grade);
//		this is a direct way
		
		// Method with out return type
		studentGrade("Tom", 89);
		studentGrade("Jerry", 99);
		studentGrade("Popeye", 75);
		studentGrade("olive", 50);
		studentGrade("Bluto", 95);
		// Method without return type
	}

	
	public static void studentGrade(String studentName, int score) {
		char grade;
		if(score >=90 && score <=100) {
			grade = 'A';
		}else if(score >= 80 && score<90) {
			grade = 'B';
		}else if(score >= 70 && score<80) {
			grade ='C';
		}else {
			grade = 'D';
		}
		System.out.println("Student "+ studentName + " Grade is " + grade);
	}

}
