package tiposDatosYSecuenciasDeControl;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solicite al usuario dos vectores tridimensionales e imprima su producto escalar
		Scanner sc = new Scanner(System.in);
		
		int[] vA = new int[3];
		int[] vB = new int[3];
		
		System.out.println("Dime un vector [x y z]: ");
		for(int i = 0; i < 3; i++) {
			vA[i] = sc.nextInt(); //haciendo el bucle, puedes escribir 3 números
		}
		
		System.out.println("Dime otro vector [x y z]: ");
		for (int i = 0; i < 3; i++) {
			vB[i] = sc.nextInt(); //vas almacenando en el array
		}
		
		int prodEsc = 0;
		for (int i = 0; i < 3; i++) {
			prodEsc += vA[i] * vB[i]; //sumas e igualas a la multiplicacion
		}
		
		System.out.println("El producto escalar entre ambos vectores es: " + prodEsc);
		
		sc.close();
		
	}

}
