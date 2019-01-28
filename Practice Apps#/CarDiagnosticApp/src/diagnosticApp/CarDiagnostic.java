package diagnosticApp;

import carData.Car;

public class CarDiagnostic {
	
	public static void main (String [] args){
		
		Car AudiA6 = new Car("Audi" , "A6", 2010, 150);
		Car Mazda323 = new Car("Mazda","323",2001,88);
		Car Toyota = new Car ("Toyota", "Corrola");
		
		System.out.println("Cars that will be diagnostic: ");
		System.out.println(AudiA6.getCarInfo());
		System.out.println(Mazda323.getCarInfo());
		System.out.println("AudiA6 upgreade in progress:");
		System.out.println(AudiA6.upgreade(45.5)+" KM");
		System.out.println("Mazda323 upgreade in progress");
		System.out.println(Mazda323.upgreade(100)+" KM");
		System.out.println(Toyota.getCarInfo());
	}

}
