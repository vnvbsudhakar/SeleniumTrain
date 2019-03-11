package inheritanceDemo;

public class CarClass extends VehicleClass {
	
	int speed;
	
	public void increaseSpeed() {
		speed++;
		System.out.println("Increasing speed");
	}
	
	public void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing speed");
	}
	
	public void carTop() {
		System.out.println("CarTop is fixed");
	}

	public static void main(String[] args) {
		CarClass car = new CarClass();
		car.stearing();
		
	}
}
