package s1_2_niv1_ex1_montseliz;

public class Product {

	private String name; 
	private float price; 
	
	public Product() {
		this.name = ""; 
		this.price = 0.0f;
	}
	
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	public void setPrice(float price) {
		this.price = price; 
	}

	@Override
	public String toString() {
		return "Nom del producte = " + this.name + ". Preu del producte = " + this.price + ".\n";
	}
	
	
	
}
