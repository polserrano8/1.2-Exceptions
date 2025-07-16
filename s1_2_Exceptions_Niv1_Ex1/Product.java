package s1_2_Exceptions_Niv1_Ex1;

public class Product {

	private String name = "";
	private double price = 0;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
