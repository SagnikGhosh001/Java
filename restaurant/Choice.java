package restaurant;

import java.util.Scanner;

public class Choice {
	int i1=1,i2=2,i3=3,i4=4,i5=5;
	String s1="Rumali Roti";
	String s2="Chicken Kosha(4ps)";
	String s3="Chili Chicken(6ps)";
	String s4="Chicken Biriyani";
	String s5="Mutton Biriyani";
	double p1=15,p2=180,p3=240,p4=200,p5=360;
	Menu[] item= {
			new Menu(i1,s1,p1),
			new Menu(i2,s2,p2),
			new Menu(i3,s3,p3),
			new Menu(i4,s4,p4),
			new Menu(i5,s5,p5),
	};
	Menu food[]=new Menu[10];
	Scanner sc=new Scanner(System.in);
	static int index=0;
	public void display() {
		for(int i=0;i<item.length;i++) {
			System.out.println(item[i].id+"."+item[i].foodName+" "+item[i].price);
		}
	}
	public void selectMenu() {
		int food_id,quan;
		String name;
		double price;
		System.out.println("\nEnter food id:");
		food_id=sc.nextInt();
		for(int i=0;i<item.length;i++) {
			if(food_id==item[i].id) {
				name=item[i].foodName;
				System.out.println("Your order:"+item[i].foodName);
				System.out.println("Enter the quantity:");
				quan=sc.nextInt();
				price=item[i].price*quan;
				food[index]=new Menu(name,quan,price);
				index++;
			}
		}
	}
	public void bill() {
		double total=0;
		for (int i=0;i<index;i++) {
			System.out.println("Item:"+food[i].foodName+"	quantity:"+food[i].quantity+"		Price:"+food[i].price);
			total=total+food[i].price;
		}
		System.out.println("total:"+total);
	}
	public static void main(String[] args) {
		Choice ch=new Choice();
		ch.display();
		char choice;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("for order press 'y' for bill press 'n'");
			choice=sc.next().charAt(0);
			switch(choice)
			{
			case 'y':
				ch.selectMenu(); 
				break;
			case 'n':
				ch.bill();
				System.exit(0);
			default:
				System.out.println("Wrong input");
			}
			}while(choice!='n');	
	}
}

