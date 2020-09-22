package week12b;

public class Earth {
	public static void main(String[]args) {
		Human luca;
		luca = new Human();
		Human ton = new Human();
		
		ton.name = "My ton";
		ton.age = 20;
		ton.height =170;
		ton.eyecolor= "Brown";
		
		luca.name = "My luca";
		luca.age = 2;
		luca.height =20;
		luca.eyecolor= "Brown";
		
		ton.display();
		luca.display();
	}
}
