package inheritanceDemo;

public class BMWClass extends CarClass{

	public void bmwGears() {
		System.out.println("BMW has 6gears");
	}
	
	public void carTop() {
		System.out.println("Convertable");
	}
	
	public void carTopParent() {
		super.carTop();
	}
	
	public void wheels() {
		System.out.println("BMW has 4 wheels only");
	}
	
	public void wheelsFromGrandParent() {
		super.wheels();
	}
	
	
	public static void main(String[] args) {
		BMWClass bmwCar = new BMWClass();
		
		bmwCar.increaseSpeed();
		bmwCar.decreaseSpeed();
		bmwCar.wheels();
		bmwCar.stearing();
		bmwCar.bmwGears();
		bmwCar.carTop();
		bmwCar.carTopParent();
		bmwCar.wheelsFromGrandParent();
		
	}
	
	
	
	

}
