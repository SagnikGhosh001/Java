package class_obj;

public class Thisdemo {
	int id;
	String name,city;
	public void getdata(int id,String name, String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public void display() {
		System.out.println("id="+id+" name="+name+" city="+city);
	}
	public static void main(String[] args) {
		Thisdemo td=new Thisdemo();
		td.getdata(101, "Sagnik", "Kokata");
		td.display();

	}

}
