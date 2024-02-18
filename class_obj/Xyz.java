package class_obj;

 class Pc {
	public int salary,year;
	public void getdata(int salary,int year) {
		this.salary=salary;
		this.year=year;
	}
	public void display() {
		System.out.println("salary="+salary+" year="+year);
	}

}
 public class Xyz{
	 public static void main(String[] args) {
		Pc p1=new Pc();
		p1.getdata(10000, 18);
		p1.display();
	}
	 
 }
