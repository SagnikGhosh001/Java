package practice;

public class Q3 {
	int height,width,area,peri;
	public Q3(int a, int b) {
		height=a;
		width=b;
		area=a*b;
		peri=2*(a+b);
	}
	public void display() {
		System.out.println("area="+area+" peri="+peri);
	}
	public static void main(String[] args) {
		Q3 p1=new Q3(2,2);
		p1.display();

	}

}
