package practice;
import java.util.Scanner;
class calculation{
	public int bonusCalculation(int year, int salary) {
	if(year>3) {
		return salary+2500;
	}
	else {
		return salary;
	}
	}
}
public class Bonus {
	public static void main(String[] args) {
	int year,salary,temp;
	calculation cal=new calculation();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter year of service:");
	year=sc.nextInt();
	System.out.println("Enter your basic salary:");
	salary=sc.nextInt();
	temp=cal.bonusCalculation(year,salary);
	System.out.println(" "+temp);
	}

}
