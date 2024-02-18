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
class puppy extends Dog{
	public void weep() {
		System.out.println("weeping...");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		puppy p1=new puppy();
		p1.bark();
		p1.eat();
		p1.weep();

	}

}
