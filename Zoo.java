package week12b;

public class Zoo {
	public static void main(String[]args) {
		Animal zoo1;
		zoo1 = new Animal(12,"M",3);
		zoo1.eat();
		zoo1.walk();
		zoo1.sleep();
		System.out.println("************ ");
		Bird bird;
		bird = new Bird(3,"M",1);
		bird.fly();
		System.out.println("************ ");
		Fish fish;
		fish = new Fish(11,"M",20);
		fish.swim();
	}
}
