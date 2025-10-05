package tiposDatosYSecuenciasDeControl;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calcule el mínimo y el máximo de una serie de números enteros positivos
		// introducidos por
		// el usuario. Cuando el usuario introduzca un número negativo se considerará
		// que el anterior
		// a este es el último número.

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime una serie de números: ");

		int min = Integer.MAX_VALUE; //pongo el minimo igual al valor maximo para luego cambiar valores
		int max = Integer.MIN_VALUE; //pongo em maximo igual al valor minimo para luego cambiar valores
		int num; //aquí voy metiendo los numeros que me pasan por consola

		while (true) { //esto es un bucle infinito hasta que se de la condicion del break
			num = sc.nextInt(); //lee el numero por consola y lo almacena en num
			if (num < 0) { //si es negativo se sale del bucle
				break;
			} else if (num < min) {//si el número por consola es menor, se sustituye 
				min = num;
			} else if (num > max) {// si es mayor se sustituye en max
				max = num;
			}
		}

		if (max == Integer.MIN_VALUE) {//pone el máximo número como uno negativo, por lo q salta error
			System.out.println("No introdujiste ningún número positivo");
		} else {
			System.out.println("Número máximo: " + max);
			System.out.println("Número mínimo: " + min);
		}
		sc.close(); //cierra el escaner
	}

}
