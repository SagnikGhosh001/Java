package Practice_sir;
class Employe{
	long employeeId,employeePhone;
	String employeeName,employeeAddress;
	double basicSalary,specialAllowance=250.80,hra=1000.50;
	public Employe(long id,long phone,String address,String name,double salary) {
		employeeAddress=address;
		employeeId=id;
		employeeName=name;
		employeePhone=phone;
		basicSalary=salary;
	}
	public void calculateSalary() {
		double salary;
		salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
		System.out.println("The salary is:-"+salary);
	}
	public void transportAllowance() {
		double transportAllowance;
		transportAllowance=10/100f*basicSalary;
		System.out.println("Travel allowance is:"+transportAllowance);
	}
}
class Manager extends Employe{
	public Manager(long id,long phone,String address,String name,double salary) {
		super(id,phone, address,name,salary);	
	}
	public void transportAllowance() {
		double transportAllowance;
		transportAllowance=15/100f*basicSalary;
		System.out.println("Travel allowance is:"+transportAllowance);
	}
}
class Traniee extends Employe{
	public Traniee(long id,long phone,String address,String name,double salary) {
		super(id,phone, address,name,salary);
	}
}
public class Inheritance_employee {

	public static void main(String[] args) {
		Manager m=new Manager(1234, 237844,"Chennai India","peter", 65000);
		m.calculateSalary();
		m.transportAllowance();
		Traniee t=new Traniee(29846, 442085, "Mumbai India", "Jack", 45000);
		t.transportAllowance();
		t.calculateSalary();
	}

}
