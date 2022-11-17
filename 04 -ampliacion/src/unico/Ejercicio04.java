package unico;

public class Ejercicio04 {

	public static void main(String[] args) {

/* Ampliación : Repetir el ejercicio anterior con una versión que calcule
 * el máximo de 3 números. Piensa un poco, no hagas el algoritmo de
 * comparación de los 3 números desde cero.
 */
	
		int num1;
		int num2;
		int num3;
		int numMayor;
		
		num1 = Util.leerInt("Introduzca un primer número: ");
		num2 = Util.leerInt("Introduzca un segundo número: ");
		num3 = Util.leerInt("Introduzca un tercer número: ");
		
		numMayor = mayor(mayor(num1, num2), num3);
		
		Util.escribirLn("El número mayor es: " + numMayor);
	}
	
	public static int mayor(int n1, int n2) {
		int m; 
		m = (n1<n2) ? n2 : n1;
		return m;
	}
}
