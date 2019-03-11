package oopsconcepts;

public class MethodsDemo {
	public static void main(String[] args) {
//		int[] scoresOfAllStudents = {34,654,223,765,456,4654,3456,435,876,765,32,87,324,98,43};
		char grade;
		grade = studentGrade(89);
		displayStudentGrade("Sudhakar", grade);
		
		grade = studentGrade(79);
		displayStudentGrade("Srujuna", grade);
		
		grade = studentGrade(99);
		displayStudentGrade("Arjun", grade);
	}
	
	public static char studentGrade(int score) {
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
		return grade;
	}
	
	public static void displayStudentGrade (String studentName, char grade) {
		System.out.println("Student "+ studentName + " Grade is " + grade);
	}

}
