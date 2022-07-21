package ch16;

public class CarFactory {
	
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {} //생성

	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
}