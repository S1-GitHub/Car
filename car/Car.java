package by.htp.car;

public class Car {
	String name;
	String model;
	int probeg;
	
	
	Engine engine;
	
	public void drive(int distance) {
		probeg = probeg + distance;
	}

	public int getProbeg() {
		return probeg;
	}
	public Car () {
		engine=new Engine();
	}
	
}
