package Practice_sir;
import java.util.Scanner;
public class Employee {
	public float getAppraisal(int year,float basicSalary) {
		if(year>=2) {
			return basicSalary*0.20f;
	}
		else if(year>=1) {
			return basicSalary*0.10f;
		}
		else {
			return 0;
		}
	}
	public int calculateTA(String emplDesignation) {
		if(emplDesignation=="manager") {
			return 3000;
		}
		else {
			return 1000;
		}
	}
	public static void main(String[] args) {
		int ta;
		float appraisal;
		int emplId,year;
		float basicSalary;
		String emplName,emplDesignation;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		emplId=sc.nextInt();
		System.out.println("Enter name:");
		emplName=sc.next();
		System.out.println("Enter your designation:");
		emplDesignation=sc.next();
		System.out.println("Enter salary:");
		basicSalary=sc.nextFloat();
		System.out.println("Enter year of service:");
		year=sc.nextInt();
		Employee emp=new Employee();
		appraisal=emp.getAppraisal(year,basicSalary);
		ta=emp.calculateTA(emplDesignation);
		System.out.println("name="+emplName+" id="+emplId+" Designation="+emplDesignation+" Year of service="+year+"years salary="+basicSalary);
		System.out.println("Apparsial Ammount="+appraisal+" TA="+ta);
	sc.close();
	}

}
