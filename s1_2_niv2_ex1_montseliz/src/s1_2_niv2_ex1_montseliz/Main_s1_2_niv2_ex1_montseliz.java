package s1_2_niv2_ex1_montseliz;

public class Main_s1_2_niv2_ex1_montseliz {

	public static void main(String[] args) {
		
		byte valueByte = Input.readByte("Introdueix la teva edat:"); 
		System.out.println("La teva edat és: " + valueByte); 
		
		System.out.println(""); 
		
		int valueInt = Input.readInt("Introdueix el teu DNI sense la lletra final:"); 
		System.out.println("El teu DNI és: " + valueInt); 
		
		System.out.println(""); 
		
		float valueFloat = Input.readFloat("Introdueix el teu sou mensual amb decimals:"); 
		System.out.println("El valor que has introduït és: " + valueFloat); 
		
		System.out.println(""); 
		
		double valueDouble = Input.readDouble("Introdueix la distància entre la teva ciutat i Nova York amb decimals:"); 
		System.out.println("El valor que has introduït és: " + valueDouble); 
		
		System.out.println(""); 
		
		char inputChar = Input.readChar("Introdueix la inicial del teu nom:"); 
		System.out.println("La inicial del teu nom és: " + inputChar);
		
		System.out.println("");
		
		String inputString = Input.readString("Introdueix el teu correu electrònic:"); 
		System.out.println("El teu correu electrònic és: " + inputString); 
		
		System.out.println("");
	
		boolean inputBoolean = Input.readYesNo("Tens carnet de conduir? ");
		System.out.println("Has respost: " + inputBoolean); 
		
		
		
		
		
	}

	
}
