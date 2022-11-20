package s1_2_niv1_ex1_montseliz;

import java.util.ArrayList;

public class Sale {
	
	static ArrayList<Product> arrayProducts = new ArrayList<Product>();
	private float totalPrice; 
	
	public Sale() {
		this.totalPrice = 0.0f;
	}
	
	public ArrayList<Product> getArrayProducts() {
		return arrayProducts; 
	}
	public float getTotalPrice() {
		return totalPrice; 
	}
	
	public void setArrayProducts(Product product) {
		Sale.arrayProducts.add(product);
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice; 
	}
	
	public void calculateTotal() throws EmptySaleException, ArrayIndexOutOfBoundsException {
		
		if (Sale.arrayProducts.size() == 0) {
			throw new EmptySaleException("Per fer una venda primer has d'afegir productes."); 
		} else if (Sale.arrayProducts.size() > 10) {
			throw new ArrayIndexOutOfBoundsException("La llista sobrepassa el límit. No pot superar els 10 productes. Surt de l'aplicació i torna a començar.");
		} else {
			for (int i = 0; i < Sale.arrayProducts.size(); i++) {
				totalPrice += Sale.arrayProducts.get(i).getPrice(); 
			}
			System.out.println("El preu total de la venda és: " + totalPrice + "\n"); 
		}
	}
	
	
	
	
}
