package Interfa;

public class Dog implements Animal {

	public void name() {
		System.out.println(" Dog hello");

	}

	@Override
	public void age() {
		System.out.println("20 years old");

	}

	@Override
	public void run() {
		System.out.println("20km/h");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name();
		dog.age();
		dog.run();
	}
}
