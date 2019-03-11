package oopsconcepts;

public class CarConstructor {
	private String make;
	private String color;
	private String model;
	private int year;
	private boolean automatic;
	
	public CarConstructor() {
		System.out.println("this is from plain constructor");
	}
	
	public CarConstructor(int i) {
		System.out.println("this is from int arg constructor and int arg is:   " + i);
	}
	
	public void carMethod() {
		System.out.println("i am from car method");
		
	}
	
	
	public static void main(String[] args) {
		CarConstructor cc = new CarConstructor();
		CarConstructor cc1 = new CarConstructor(5);
		cc.carMethod();
	}
	
	
}
