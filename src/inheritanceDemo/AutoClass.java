package inheritanceDemo;

public class AutoClass extends VehicleClass{
	
	public void wheels() {
		System.out.println("Auto has 3 wheels");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutoClass ac = new AutoClass();
		ac.wheels();
//		AutoClass ac1 = new VehicleClass();
//		ac1.wheels();
		VehicleClass ac2 = new AutoClass();
		ac2.wheels();
		

	}

}
