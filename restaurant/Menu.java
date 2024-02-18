package restaurant;

public class Menu {
	int id,quantity;
	String foodName;
	double price;
	public Menu(int id,String foodName,double price) {
		this.foodName=foodName;
		this.id=id;
		this.price=price;
	}
	public Menu(String foodName,int quantity,double price) {
		this.quantity=quantity;
		this.foodName=foodName;
		this.price=price;
	}
}
