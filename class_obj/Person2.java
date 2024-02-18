package class_obj;

public class Person2 {
	int age;
	String name;
	int salary;
	
	public void getData(int a, String n, int s) {
		age=a;
		name=n;
		salary=s;
	}
	public void display() {
		System.out.println("name= "+name+" age= "+age+" salary= "+salary);
	}
	public static void main(String[] args) {
		Person2 p1=new Person2();
		p1.getData(18,"Sagnik",100000);
		p1.display();
	}

}
