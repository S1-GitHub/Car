package by.htp.car;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.drive(250);
		car.drive(100);
		car.drive(290);
		
		
		System.out.println(car.getProbeg());
		
		Car car1 = new Car();
		
		car1.name = "Land Rover";
	    car1.engine.amount = 5;
	    car1.engine.cilindr=12;
	    car1.engine.fuel="Benzin";
	    car1.model="Discovery";
	    
	    Car car2=new Car();
	    
	    car2.name="Maserati";
	    car2.model="Levante";
	    car2.engine.amount=3200;
	    car2.engine.cilindr=6;
	    car2.engine.fuel="Benzin";
	    
	    
		
	}
	
	
}
