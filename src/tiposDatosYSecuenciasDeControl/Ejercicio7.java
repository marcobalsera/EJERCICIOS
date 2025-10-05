package tiposDatosYSecuenciasDeControl;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tome un número entero escrito por el usuario y lo descomponga en factores
		// primos. Por ejemplo: 40 = 2 × 2 × 2 × 5

		Scanner sc = new Scanner(System.in); 

		System.out.println("Dime un número y te lo factorizo: ");

		int a = sc.nextInt();
		int original = a; //aquí guardo el número q dan pa imprimirlo bonito
		System.out.print(original + " = "); //no pongo println pq el ln lo q hace es cambiar de linea, y no lo deja bonito
		
		int factor = 2; //empiezo por este factor, pq 1 no cuenta pa dividir papi
		boolean primer = true;//pongo boolean para usarlo en el while

		while (a > 1) { //se entiende este
			if (a % factor == 0) { //si a es divisible por el factor
				
				// estas lineas son de pensar. 
				if (!primer) {//la primera vez (cuando primer es true), no imprime nada, pq lo estoy negando y es false
							  //pero la segunda vez, debajo pongo primer a false, por lo q si niego false es true, así
							  //q ahora si imprime la x. Rollo imprime "x nummero" cada vez
					System.out.print(" x ");
				}
				System.out.print(factor); //imprime factor
				primer = false; //es pa lo q dije arriba
				
				a = a / factor; //divido el número entre el factor
			} else {
				factor++; //si no pasa lo de arriba, pruebo con un factor mas grande y repito 
			}

		}

		sc.close(); //cierro scanner

	}

}
