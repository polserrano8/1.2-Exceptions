package s1_2_Exceptions_Niv1_Ex1;

import s1_2_Exceptions_Niv1_Ex1.model.Product;
import s1_2_Exceptions_Niv1_Ex1.model.SellingPoint;

public class Main {

	public static void main(String[] args) {

		SellingPoint Store = new SellingPoint();

		Product Jam = new Product("Jam",3.02);
		Product Jelly = new Product("Jelly",2.5);

		Store.totalCalculation();

		Store.addProduct(Jelly);
		Store.addProduct(Jam);
		Store.totalCalculation();
	}

}
