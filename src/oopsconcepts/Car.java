package oopsconcepts;

public class Car {

	private String make;
	private String color;
	private String model;
	private int year;
	private boolean automatic;
	private int gears;
	
	public Car() {
		System.out.println("I am from default consutructor");
	}
	
	
	public Car(int year, String model) {
		this.year = year;
		this.model = model;
		System.out.println("car model " + model);
		System.out.println("Car year "+ year);
	}
	
	public void increaseSpeed() {
		System.out.println("Accelerator is pressed, Speed is increased");
	}
	
	public void setMake(String make) {
		this.make = make;	
	}
	
	public String getMake() {
		return make;
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>1900) {
			this.year = year;
		}else {
			System.out.println("This year is not a valid");
		}
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}
	
//	String benz_model = "C300";
//	String benz_color = "Black";
//	boolean benz_isAutomatic = true;
//	int benz_year = 2000;
//	String benz_make = "Merc";
	
//	String VW_model = "polo";
//	String VW_color = "White";
//	boolean VW_isAutomatic = false;
//	int VW_year = 2010;
//	String VW_make = "VW";

//	String BMW_model = "X1";
//	String BMW_color = "Blue";
//	boolean BMW_isAutomatic = true;
//	int BMW_year = 2013;
//	String BMW_make = "BMW";
	
//	audi
//	honda
//	hyndai
//	toyota
//	maruthi
//	lexus
//	KIA
	
	
	}
