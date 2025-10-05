package tiposDatosYSecuenciasDeControl;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calcule la suma de todos los múltiplos de 5 comprendidos entre 1 y 100.
		// También debe
		// calcular cuántos hay y mostrar visualizar cada uno de ellos.
		int suma = 0;
		int contador = 0;

		System.out.println("Múltiplos de 5:");

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
				suma = suma + i;
				contador++;
			}
		}
		System.out.println("Suma total: " + suma);
		System.out.println("Número de múltiplos: " + contador);
	}

}
