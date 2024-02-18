package practice;

public class Q2_dog {
	String name;
	String breed;
	public Q2_dog(String n, String b) {
		name=n;
		breed=b;
	}
	public void getData(String n, String b) {
		name=n;
		breed=b;
	}
	public void display() {
		System.out.println("name= "+name+" breed= "+breed);
	}
	public static void main(String[] args) {
		Q2_dog p1=new Q2_dog("Rocky", "Street");
		Q2_dog p2=new Q2_dog("Rocky1", "Street1");
		p1.getData("New name","new breed");
		p2.getData("New name1","new breed1");
		p1.display();
		p2.display();
	}

}
