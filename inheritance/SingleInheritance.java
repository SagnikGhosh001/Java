package inheritance;
class Animal{
	public void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("barking...");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.bark();
		d1.eat();

	}

}
