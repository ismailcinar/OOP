
public class Main {
	public static void main(String[]args) {
		
		Car car1 =new Car();
		car1.brand="Honda";
		car1.color="blue";
		car1.license="19iso19";
		car1.year=2019;
		
		Car car2=new Car();
		car2.brand="Toyota";
		car2.color="green";
		car2.license="19osi19";
		car2.year=2001;
		
		car1.print();
		System.out.println("------------------");
		car2.print();
		
					
		car1.moveOn();
		car1.stop();
		car2.moveOn();
		car2.stop();
		
		System.out.println("brand of first car :"+car1.showBrand());
		System.out.println("brand of second car :"+car2.showBrand());

	}
}
