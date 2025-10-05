package array;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Rellene una matriz cuadrada (las dimensiones de la matriz serán un
		// parámetro que se pida al usuario) con números aleatorios, de tal modo
		// que la matriz sea simétrica. También debe mostrar la matriz por pantalla.

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("Dime tamanio de la matriz: ");
		int size = sc.nextInt();

		int[][] matriz = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				int valor = rnd.nextInt(100);
				matriz[i][j] = valor;
				matriz[j][i] = valor;
			}
		}

		System.out.println("Matriz simétrica:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.printf("%4d", matriz[i][j]);
			}
			System.out.println();
		}

		sc.close();

	}

}
