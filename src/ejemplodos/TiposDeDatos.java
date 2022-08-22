package ejemplodos;

public class TiposDeDatos {

	public static void main(String[] args) {
		// Esto es un comentario de una línea
		/* Este es otro
		 * comentario
		 * pero de varias líneas */
		//Tipos de datos primitivos
		//Enteros - int, long, byte, short
		byte numByte = -110;
		System.out.println(numByte);
		short numShort = 32_767;
		System.out.println(numShort);
		int numInt = -2_147_483_648;
		System.out.println(numInt);
		long numLong = -9_223_372_036_854_700_000L;
		System.out.println(numLong);
		System.out.println("-------------------------");
		byte num1=100, num2=100;
		short num3 =  (short)(num1 + num2);
		System.out.println("El valor de num3 es " + num3);
		System.out.println("-------------------------");
		//Reales - double, float
		float numFloat = 12.85f;
		double numDouble = 12.85d;
		System.out.println("numFloat es " + numFloat);
		System.out.println("numDouble es " + numDouble);
		//Caracter - char
		//Lógicos/Booleanos
		
	}

}
