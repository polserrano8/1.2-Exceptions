package s1_2_Exceptions_Niv1_Ex1;

public class Main {

	public static void main(String[] args) {
		// Creating the store where all the magic happens
		SellingPoint Store = new SellingPoint();
		// Creating products to add to the basket.
		Product Jam = new Product("Jam",3.02);
		Product Jelly = new Product("Jelly",2.5);
		//Making the first calculation of price to activate the exception
		Store.totalCalculation();
		//Adding the products to the store
		Store.addProduct(Jelly);
		Store.addProduct(Jam);
		Store.totalCalculation();
	}

}
