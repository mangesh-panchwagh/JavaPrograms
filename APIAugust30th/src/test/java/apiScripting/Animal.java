package apiScripting;

public class Animal {

	// Variables are states and properties of the class
	// Variables - class knows something
	String name = "Oreo";
	int age = 2;

	public static void main(String[] args) {
		System.out.println("Welcome to Edureka");
		eat();
		sleep();
		play();
	}

	// Methods - Define Behavior / Actions
	// Methods - class does something
	public static void eat() {
		System.out.println("Oreo loves to eat");
	}

	public static void play() {
		System.out.println("Oreo likes to play");
	}

	public static void sleep() {
		System.out.println("Oreo sleeps mostly");
	}

}
