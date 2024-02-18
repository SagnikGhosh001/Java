package class_obj;

public class Person {
	//instance variable
//			int age=27;
//			String name="Nilanjan";
//			int salary=27000;
	int age;
	String name;
	int salary;
	
//			public void getData(int a,String n,int s)
//			{
//				age=a;
//				name=n;
//				salary=s;
//				
//			}
	public Person(int a,String n,int s) {
		age=a;
		name=n;
		salary=s;
	}
			public void display()
			{
				System.out.println("Name: "+name+"Age: "+age+"Salary: "+salary);
			}
	
	public static void main(String[] args) {
		
		Person p1=new Person(27, "Nilanjan", 9000);//constructor calling
//		System.out.println("Name: "+p1.name);
//		System.out.println("Age: "+p1.age);
//		System.out.println("Salary: "+p1.salary);
//		p1.getData(27, "Nilanjan", 9000);
		p1.display();
	}

}