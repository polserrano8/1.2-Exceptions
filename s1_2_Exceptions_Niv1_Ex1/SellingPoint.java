package s1_2_Exceptions_Niv1_Ex1;

import java.util.ArrayList;

public class SellingPoint {
	private double totalSellingPrice;  
	ArrayList<Product> productList = new ArrayList<Product>();
	
	public void totalCalculation() {
		
		int x;
		
		try{
			if(productList.isEmpty()) {
				throw new EmptySellingException("To be able to make a sell first you have to add products");
			}
			else {
				for(x=0; x<this.productList.size();x++) {
					totalSellingPrice  += productList.get(x).getPrice();
				}
			}
		}
		catch(EmptySellingException e1) {
			System.out.println(e1.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
			System.out.println(e2.getMessage());
		}
		System.out.println(totalSellingPrice);
	
	}
	public void addProduct(Product product) {
		this.productList.add(product);
	}
	
	

}
