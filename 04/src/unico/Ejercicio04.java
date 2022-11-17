package unico;

public class Ejercicio04 {

	public static void main(String[] args) {

/* Implementar un método que reciba como parámetros dos números
 * enteros y que devuelva el mayor de los dos.
 */
	
		int num1;
		int num2;
		int numMayor;
		
		num1 = Util.leerInt("Introduzca un primer número: ");
		num2 = Util.leerInt("Introduzca un segundo número: ");
		
		numMayor = mayor(num1, num2);
		
		Util.escribirLn("El número mayor es: " + numMayor);
	}
	
	public static int mayor(int n1, int n2) {
		int m;
		if (n1<n2) {
			m = n2;
		} else {
			m = n1;
		}
		return m;
	}
}
