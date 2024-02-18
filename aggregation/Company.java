package aggregation;

public class Company {
	String name;
	int id;
	Address adr;//entity reference

	public Company(String name, int id, Address adr) {
		super();
		this.name = name;
		this.id = id;
		this.adr = adr;
	}

	public static void main(String[] args) {
		Address ad1=new Address("Kolkata","India", 700024);
		Company c1= new Company("Tcs",101, ad1);
		System.out.println("Com id:"+c1.id);
		System.out.println("Com name:"+c1.name);
		System.out.println("City:"+c1.adr.city);
		System.out.println("City:"+c1.adr.getCity());
		System.out.println("Country:"+c1.adr.country);
		System.out.println("Pincode:"+c1.adr.pincode);

	}

}
