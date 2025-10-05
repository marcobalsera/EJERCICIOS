package array;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tome un array de floats y devuelva la suma de todos sus elementos.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime cuantos elementos quieres en tu array: ");
		int a = sc.nextInt();
		float[] serresiete = new float[a]; //creas el array de floats con el número de elementos q te digan
		
		System.out.println("Qué elementos quieres meter en tu array: ");
		for (int i = 0; i < a; i++) { //hago un bucle para ir metienedo los numeros que me digan en el array
			System.out.println("Elemento " + (i+1) + " : ");
			serresiete[i] = sc.nextFloat();
		}
		
		float suma = 0;
		for (int i = 0; i < a; i++) {
			suma = suma + serresiete[i]; //suma normal
		}
		
		System.out.println("La suma de los elementos es: " + suma);
		
		sc.close();
	}

}
