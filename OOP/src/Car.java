
public class Car {
	String license;
	int year;
	String color;
	String brand;
	
	public void moveOn() {
		
		System.out.println("car is moving.");
	}
	
	public void stop() {
		
		System.out.println("car has been stopped.");
	}
	public void print() {
		System.out.println("Car informations :");
		System.out.println("Brand :"+brand);
		System.out.println("license :"+license);
		System.out.println("year :"+year);
		System.out.println("color :"+color);

	}
	public String showBrand()
	{
		return brand;
	}
	
}
