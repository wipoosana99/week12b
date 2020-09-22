package week12b;

public class Human {
	String name;
	int age;
	int height;
	String eyecolor;
	public Human() {
		super();
	}
	public void display() {
		System.out.println("Hello, My name is " + name);
		System.out.println("I am " + age + " years old");
		System.out.println("I am " + height + " iches tall");
		System.out.println("My eye color is " + eyecolor);
		System.out.println("********************* " );
	}
	public void eat() {
		System.out.println("Eating...");
	}
	public void walk() {
		System.out.println("Walking...");
	}
	public void work() {
		System.out.println("Working...");
	}
}
