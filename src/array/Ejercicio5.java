package array;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reciba una matriz (array bidimensional de floats, siguiendo el orden de
		// primero fila y luego columna), y devuelva un array que contenga el valor
		// máximo de cada fila.

		Scanner sc = new Scanner(System.in);

		System.out.print("Número de filas: ");
		int filas = sc.nextInt();
		System.out.print("Número de columnas: ");
		int columnas = sc.nextInt();

		float[][] bitch = new float[filas][columnas];

		System.out.println("Introduce elementos de la matriz: ");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.println("Elemento [" + i + "][" + j + "]: ");
				bitch[i][j] = sc.nextFloat();//metemos movidas dentro de la matriz
			}
		}

		float[] maxim = new float[filas]; //array para meter los máximos

		for (int i = 0; i < filas; i++) {
			float max = bitch[i][0]; //cuento el primer elemento como máximo, para luego sustituir y comparar
			for (int j = 0; j < columnas; j++) {
				if (bitch[i][j] > max) {
					max = bitch[i][j];//cambio el maximo
				}
			}
			maxim[i] = max;//cambio el valor para repetir la iteracion
		}

		System.out.println("Máximos de cada fila:");
		for (int i = 0; i < filas; i++) {
			System.out.println("Fila " + i + ": " + maxim[i]);
		}

		sc.close();

	}

}
