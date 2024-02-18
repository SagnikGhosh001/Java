package practice;

public class Q4 {
	int radius;
	float cir,area;
	public void getData(int r) {
		radius=r;
		cir=2*3.14f*radius;
		area=3.14f*radius;
	}
	public void updates(int r1){
		radius=r1;
		cir=2*3.14f*radius;
		area=3.14f*radius;
	}
	public void display() {
		System.out.println("circumferance="+cir+"area="+area);
	}
	public static void main(String[] args) {
		Q4 p1=new Q4();
		p1.getData(2);
		p1.updates(3);
		p1.display();

	}

}
