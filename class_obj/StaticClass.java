package class_obj;

class Sc {
	private int salary,id;
	private String name;
	static String univ="wbscte";
	public void getdata(int salary,int id,String name) {
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	public void display() {
		System.out.println(" "+salary+" "+id+" "+name);
	}
}
public class StaticClass{
	public static void main(String[] args) {
		Sc s1=new Sc();
		s1.getdata(10000,101,"Sagnik");
		s1.display();
		System.out.println(Sc.univ);
	}
}
