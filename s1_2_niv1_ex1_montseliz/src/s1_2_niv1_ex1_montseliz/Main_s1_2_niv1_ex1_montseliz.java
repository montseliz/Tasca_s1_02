package s1_2_niv1_ex1_montseliz;

import java.util.Scanner;

public class Main_s1_2_niv1_ex1_montseliz {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		Product product = new Product();  
		int menu = 0;  
		Sale sale = new Sale();
		
		do {
			System.out.println("Escull quina opció vols realitzar de l'aplicació de compra:" 
		   		+ "\n1. Introdueix els productes per comprar."
				+ "\n2. Veure tots els productes per comprar."
				+ "\n3. Calcular el total de la venda."
		   		+ "\n0. Sortir de l'aplicació.");
			menu = input.nextInt(); 
			
			switch (menu) {
			case 0:
				System.out.println("Gràcies per la teva compra. Fins la propera!");
			break;
			case 1:
				System.out.println(createProduct(product)); 
			break; 
			case 2:
				System.out.println(seeProducts(product)); 
			break; 
			case 3: 
				sale = new Sale();  
				try { 
					sale.calculateTotal();
				} catch (EmptySaleException e) {
					System.out.println(e.getMessage()); 
					//e.printStackTrace();
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
					//e.printStackTrace();
				}
			break; 
			default: 
				System.out.println("Error. Introdueix un número correcte del 0 al 3.");
			} 
			
		} while (menu != 0); 
		
		input.close(); 
	
	}
	
	public static String createProduct(Product product) {
		product = new Product(); 
		System.out.println("Introdueix el nom del producte:");
		input.nextLine();
		product.setName(input.nextLine());
		System.out.println("Introdueix el preu del producte:");
		product.setPrice(input.nextFloat());
		Sale.arrayProducts.add(product); 
	
		return "El producte s'ha introduït correctament.\n"; 
	}
	
	public static String seeProducts(Product product) {
		String answer = "";  
		
		for (int i = 0; i < Sale.arrayProducts.size(); i++) {
			answer += Sale.arrayProducts.get(i).toString(); 
			} 
		
		return "Tots els productes introduïts per comprar són:\n" + answer;
		
	}
}
