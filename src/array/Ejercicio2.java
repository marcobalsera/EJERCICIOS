package array;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Busque un valor específico en un array de ints (no ordenado) y devuelva
		// su posición, o -1 si el valor no existe.

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos elementos quieres en tu array: ");
		int a = sc.nextInt();
		int[] puto = new int[a];

		System.out.println("Qué elementos quieres meter en tu array: ");
		for (int i = 0; i < a; i++) { // hago un bucle para ir metienedo los numeros que me digan en el array
			System.out.println("Elemento " + (i + 1) + " : ");
			puto[i] = sc.nextInt();
		}

		System.out.println("Dime el elemento que quieras y te doy su posición: ");
		int elemento = sc.nextInt();
		int posicion = -1; //lo pongo a -1 para ahorrar codigo
		for (int i = 0; i < puto.length; i++) {
			if (puto[i] == elemento) {//si se encuentra el elemento
				posicion = i;
				break;
			}
		}

		if (posicion != -1) { //si la posicion es diferente a -1
			System.out.println(elemento + " está en la posición " + posicion);
		} else {
			System.out.println(elemento + " no existe en el array.");
		}

		sc.close();
	}

}
