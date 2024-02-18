package practice;

public class Q6 {
	int salary=10000;
	String job,title;
	public Q6(int s, String j, String t) {
		salary=s;
		job=j;
		title=t;
	}
	public void display() {
		System.out.println("salary="+salary+" job="+job+" title="+job);
	}
	public static void main(String[] args) {
		Q6 p1=new Q6(20000,"ceo","senior");
		p1.display();
		

	}

}
