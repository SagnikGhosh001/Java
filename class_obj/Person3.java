package class_obj;

public class Person3 {
	int age;
	String name;
	int salary;
	public Person3(int a, String n, int s) {
		age=a;
		name=n;
		salary=s;
	}
	public void display() {
		System.out.println("name= "+name+" age= "+age+" salary= "+salary);
	}
	public static void main(String[] args) {
		Person3 p1=new Person3(18,"sagnik",90000);
		p1.display();

	}

}
