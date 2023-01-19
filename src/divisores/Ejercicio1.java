package divisores;

import java.util.Scanner;

public class Ejercicio1 {

	private static final String NÚMERO_DE_DIVISORES = "Número de divisores: ";

	public static void main(String[] args) {
		int numeroUsuario;
		long numDivisores;
		Scanner sc = new Scanner(System.in);
		
		numeroUsuario = sc.nextInt();
		numDivisores = primeDivisors(numeroUsuario);
		
		System.out.println(NÚMERO_DE_DIVISORES + numDivisores);
		sc.close();
	}

	private static long primeDivisors(long number) {
		int cont = 0;
		
		for(int i=2; i<=number; i++) {
			boolean esDivisor = number%i==0;
			if(esDivisor && esPrimo(i)) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public static boolean esPrimo(int numero) {
		boolean esPrimo = true;
		for(int i=2; i<numero; i++) {
			int metodo = numero%i;
			if(metodo == 0) {
				esPrimo = false;
				break;
			}
		}
		return esPrimo;
	}
}
