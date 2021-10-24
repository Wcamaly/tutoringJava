package basic;

public class Primitive {
	static void basic() {
		/*
		 * Representa un tipo de dato de 8 bits con signo. 
		 * De tal manera que puede almacenar los valores numéricos de -128 a 127 (ambos inclusive).
		 * */
		byte bCarry = 1; 
		/*
		 * Representa un tipo de dato de 16 bits con signo. 
		 * De esta manera almacena valores numéricos de -32.768 a 32.767.
		 * */
		short sNumber; 

		/*
		 * Es un tipo de dato de 32 bits con signo para almacenar valores numéricos. 
		 * Cuyo valor mínimo es -231e^10 y el valor máximo 231e^10.
		 * */
		int iNumber = 0;
		
		/*
		 * Es un tipo de dato de 64 bits con signo que almacena valores numéricos entre -263e^10 a 263e^10
		 * */
		long lNumber;
		
		/*
		 * Es un tipo dato para almacenar números en coma flotante con precisión simple de 32 bits.
		 * */
		float fNumber;
		
		/*
		 * Es un tipo de dato para almacenar números en coma flotante con doble precisión de 64 bits.
		 * */
		double dNumber;
		
		/*
		 * Sirve para definir tipos de datos booleanos. 
		 * Es decir, aquellos que tienen un valor de true o false. Ocupa 1 bit de información.
		 * */
		boolean bValue;
		
		/*
		 * Es un tipo de datos que representa a un carácter Unicode sencillo de 16 bits.
		 * */
		char cCharacter = 'e';
		
		String sText = "Hello world";
		
		// Arreglos
		int[] aiNumbers = {1,2,3,4,5,6};
		
		System.out.println(aiNumbers[0]);
		System.out.println(aiNumbers.length);
		
		// Error por que la posicion 8 no existe
		// aiNumbers[7]= 9;
		
		
		// Condicionales 
		if (true) {
			// Condicion si es verdadera
		} else {
			// Condicion si es falso
		}
		///////////////////////////////////////
		if (true) {
			
		}else if (false) {
			// condicion ~p ^ R
		}
		
		try {
			// codigo con probabilidad a fallas
		} catch (Exception e) {
			// caso de falla
		}
		
		///////////////////////////
		switch (iNumber) {
		case 0: 
			// condicion iNumber == 0
			break;
		case 1: 
			// condicion iNumber == 1
			break;
		default:
			// Condicion default
			break;
		}
		
		
		/*
		 * Bucles/ iteraciones
		 * */
		
		while (iNumber <= 100) {
			// Mientras ocurra la condicion
		}
		
		/////////////////////////////////
		iNumber= 101;
		do {
			// Mientras ocurra la condicion, pero la primera vez se ejecuta sin evaluacion
			System.out.println(iNumber);
			iNumber++;			
			
		} while (iNumber <= 100);
		/////////////////////////////////
		
		for(int i=0; i < 100; i++) {
			// Condicion hasta i < 100
		}
	}
}
