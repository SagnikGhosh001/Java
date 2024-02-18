package practice;
import java.util.Scanner;
class Calculations{
	public void result(float salary) {
		float HRA,DA;
		if(salary>1500) {
			HRA=salary*0.2f;
			DA=salary*0.9f;
			System.out.println("hra="+HRA+" DA="+DA);
		}
		else {
			HRA=500;
			DA=salary*0.7f;
			System.out.println("hra="+HRA+" DA="+DA);
		}
	}
}
public class Salary_emp {
	
	public static void main(String[] args) {
		float salary;
		Calculations cal=new Calculations();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter basic salary:");
		salary=sc.nextInt();
		cal.result(salary);
	}

}

