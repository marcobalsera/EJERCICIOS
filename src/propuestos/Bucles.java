package propuestos;

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Imprimir los enteros entre -5 y 5, incluidos
		for (int i = -5; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------");
		
		//Imprimir enteros positivos menores que 100 que sean múltiplos de 2 y 3
		for (int i = 0; i<100; i++) {
			if((i % 2 == 0) || (i % 3 == 0)) {
				System.out.println(i);
			}
		}
		
		System.out.println("------------------------------");
		
		//Calcular el factorial de n
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número y te hago el factorial:");
		
		int n = sc.nextInt();
		long factorial = 1L;
		
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("El factorial de " + n + " es: " + factorial);
		
		System.out.println("------------------------------");
		
		//Calculo del número e con precisión 10^(-10)
		double e = 0.0;
		double precision = 1e-10;
		double termino = 1.0; // 1/0!
		e += termino; //sumo el primer término pq el bucle empieza por 1
		
		for (int i = 1; ;i++) { //esto es un bucle infinito, en el que salgo con el break
			termino = termino / i; // siguiente termino 1/n!
			if (termino<precision) {break;} //salgo si es menor
			e += termino; //sumo el termino
		}
		System.out.println(e);
	}

}
