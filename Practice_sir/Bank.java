package Practice_sir;
import java.util.Scanner;
public class Bank {
	static Scanner sc=new Scanner(System.in);
	public int with,dep;
	public void withdraw(int balance) {
		System.out.println("Enter ammount to withdrawl:-");
		with=sc.nextInt();
		if(with<=balance) {
			balance=balance-with;
			System.out.println("Final balance is:"+balance);
		}
		else {
			System.out.println("Insufficient ammount");
		}
	}
	public void deposit(int balance) {
		System.out.println("Enter ammount to deposite:-");
		dep=sc.nextInt();
		balance=dep+balance;
		System.out.println("Final balance is:"+balance);
	}
	public static void main(String[] args) {
		Bank bk=new Bank();
		int balance,choice;
		System.out.println("Enter initial balance:-");
		balance=sc.nextInt();
		while(true){
			System.out.println("1.withdraw\n2.Deposit\n3.exit\nEnter your choice:-");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				bk.withdraw(balance);
				break;
			case 2:
				bk.deposit(balance);
				break;
			case 3: 
				System.exit(0);
			default:
				System.out.println("Invalid input");
			}
		}
	}
}
