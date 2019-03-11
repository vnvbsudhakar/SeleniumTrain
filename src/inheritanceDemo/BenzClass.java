package inheritanceDemo;

public class BenzClass extends CarClass{
	
	public void benzGears() {
		System.out.println("Benz has 5gears");
	}
	
	public void carTop() {
		System.out.println("Convertable");
	}
	
	public static void main(String[] args) {
		BenzClass benz = new BenzClass();
		
		benz.decreaseSpeed();
		benz.benzGears();
		
		
	}

}
