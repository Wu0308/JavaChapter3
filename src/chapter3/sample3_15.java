package chapter3;

public class sample3_15 {
	public static void main(String args[]) {
		Car.showSum();
		
		Car car1;
		car1 = new Car();
		car1.setCar(1234, 20.5);
		
		Car.showSum();
		
		Car car2;
		car2 = new Car();
		car2.setCar(4567, 30.5);;
		
		
	}
}


