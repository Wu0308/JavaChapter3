package chapter3;

public class sample3_23 {
	public static void main(String args[]) {
		Car car1;
		car1 = new Car();
		
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1號車";
		
		car1.setCar(number, gasoline);
		car1.setName(str);
		
		car1.show();
		
	}
}


