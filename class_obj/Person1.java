//send the data using instance variable
package class_obj;

public class Person1 {
	
	int age=18;
	String name="sagnik"; 
	int salary=100000;
	
	public static void main(String[] args) {
		Person1 p1=new Person1();
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p1.salary);
	}

}
