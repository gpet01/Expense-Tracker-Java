
public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void sleep() {
		System.out.println(name + " is Sleepin...");
	}
	
	public void makeSound() {
		System.out.println("Bark bark");
	}

}
