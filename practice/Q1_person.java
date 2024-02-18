package practice;

public class Q1_person {
	String name;
	int age;
	public Q1_person(String n,int a) {
		name=n;
		age=a;
	}
	public void display() {
		
		System.out.println("name= "+name+"age= "+age);
	}
	public static void main(String[] args) {
		Q1_person p1=new Q1_person("sagnik",3);
		p1.display();
	}

}
