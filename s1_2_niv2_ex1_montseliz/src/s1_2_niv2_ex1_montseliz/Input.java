package s1_2_niv2_ex1_montseliz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	static Scanner input = new Scanner (System.in); 
		
	public static byte readByte(String message) {
		boolean incorrect = true; 
		byte value = 0; 
		
		do {
			System.out.println(message); 
			try { 
				value = input.nextByte();   
				incorrect = false; 
				System.out.println("Correcte."); 
			} catch (InputMismatchException e) {
				System.out.println("Error, introdueix una edat vàlida.\n"); 
			} 
			input.nextLine(); 
		} while (incorrect); 
		return value; 
	}

	public static int readInt(String message) {
		boolean incorrect = true; 
		int value = 0; 
		
		do {
			System.out.println(message); 
			try { 
				value = input.nextInt();   
				incorrect = false; 
				System.out.println("Correcte."); 
			} catch (InputMismatchException e) {
				System.out.println("Error, introdueix el teu DNI sense la lletra final.\n"); 
			} 
			input.nextLine(); 
		} while (incorrect); 
		return value; 
	}

	public static float readFloat(String message){
		boolean incorrect = true; 
		float value = 0.0f; 
		
		do {
			System.out.println(message); 
			try { 
				value = input.nextFloat();   
				incorrect = false; 
				System.out.println("Correcte."); 
			} catch (InputMismatchException e) {
				System.out.println("Error de format, introdueix els decimals amb una coma.\n"); 
			} 
			input.nextLine(); 
		} while (incorrect); 
		return value; 
	}

	public static double readDouble(String message) {
		boolean incorrect = true; 
		double value = 0.0f; 
		
		do {
			System.out.println(message); 
			try { 
				value = input.nextDouble();   
				incorrect = false; 
				System.out.println("Correcte."); 
			} catch (InputMismatchException e) { 
				System.out.println("Error de format, introdueix els decimals amb una coma.\n"); 
			} 
			input.nextLine(); 
		} while (incorrect); 
		return value; 
	}
	
	public static char readChar(String message)  {
		boolean incorrect = true; 
		char inputChar = 'A'; 
		String inputString = ""; 
		
		do {
			System.out.println(message); 
			try {
				inputString = input.next(); 
				if (inputString.length() > 1) {
					throw new Exception(); 
				} else {
					System.out.println("Correcte.");
					incorrect = false; 
				}
			} catch (Exception e) {
				System.out.println("Error, introdueix només un caràcter.");
			}
		} while (incorrect);
		
		inputChar = inputString.charAt(0); 
		return inputChar; 
	}

	public static String readString(String message) {
		boolean incorrect = true; 
		String inputString = ""; 
		int at = 0; 
		boolean dot = false; 
		
		do {
			System.out.println(message); 
			try { 
				inputString = input.next(); 
				if (inputString.length() <= 4) { 
					throw new Exception(); 
				} else {
					for (int i = 0; i < inputString.length(); i++) {
						if (inputString.charAt(i) == '@') {
							at++;
						}
						if (inputString.charAt(i) == '.') {
							dot = true; 
						}
					}
					if (at == 1 && dot == true) {
						System.out.println("Correcte.");
						incorrect = false; 
					} else {
						throw new Exception();
					}
				}
			} catch (Exception e) { 
				System.out.println("Error, introdueix un correu electrònic vàlid.\n"); 
			} 
		} while (incorrect); 
		
		return inputString;  
		
	}

	public static boolean readYesNo(String message) {
		boolean incorrect = true; 
		boolean inputBoolean = false; 
		String inputString = ""; 
		
		do {
			System.out.println(message); 
			try {
				inputString = input.next(); 
				if ((inputString.equalsIgnoreCase("s")) || (inputString.equalsIgnoreCase("n"))) {
					incorrect = false; 
					if (inputString.equalsIgnoreCase("s")) {
						inputBoolean = true; 
					} else if (inputString.equalsIgnoreCase("n")) {
						inputBoolean = false; 
					}
				} else {
					throw new Exception(); 
				}
			} catch (Exception e) {
				System.out.println("Error, introdueix S o N en cas afirmatiu o negatiu."); 
			}
		} while (incorrect);
		
		return inputBoolean; 
	}
	
}
