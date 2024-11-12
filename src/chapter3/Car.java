package chapter3;

public class Car 
{
	public static int sum = 0;
	
	int num;
	double gas;
	String name;
	
	public Car() {//沒有參數的建構子
		num = 0;
		gas = 0.0;
		name = "沒有名稱";
		sum++;
		System.out.println("生產了車子");
	}
	
	public Car(int n, double g) {//有參數的建構子
		this();
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("車名是"+name);
	}
	
	public void showCar() {
		System.out.println("開始顯示車子資料");
		this.show();
	}
	
	public void setNum(int n) {
		num = n;
		System.out.println("將車號設為"+num);
	}
	
	public void setGas(double g) {
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
	
	public void setNumGas(int n, double g) {
		if(g > 0 && g < 100) {
			num = n;
			gas = g;
			System.out.println("將車號設為"+num+"，汽油量設為"+gas);
		}
		else {
			System.out.println(g+"不是正確的汽油量");
			System.out.println("無法變更汽油量");
			
		}
		
	}
	
	public int getNum() {
		System.out.println("調查車號");
		return num;
	}
	
	public double getGas() {
		System.out.println("調查汽油量");
		return gas;
	}
	
	public void setCar(int n) {
		num = n;
		System.out.println("將車號設為"+num);
	}
	
	public void setCar(double g) {
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"、汽油量設為"+gas);
	}
	
	public void setName(String nm) {
		name = nm;
		System.out.println("將車名設為"+name);
	}

	public static void showSum() {
		System.out.println("車子總共有"+sum+"台");
	}
	
	
	
	
	
}
