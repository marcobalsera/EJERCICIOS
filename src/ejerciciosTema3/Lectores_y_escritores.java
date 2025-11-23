package ejerciciosTema3;

import java.util.*;
import java.util.concurrent.locks.*;
import java.util.concurrent.ThreadLocalRandom;

public class Lectores_y_escritores {

	public static int valorCompartido = 0;

	public static synchronized int leer() {
		return valorCompartido;
	}

	public static synchronized void escribir(int nuevoValor) {
		valorCompartido = nuevoValor;
	}

	static class Lector implements Runnable {
		private final int id;

		Lector(int id) {
			this.id = id;
		}

		@Override
		public void run() {
			System.out.println("Lector " + id + " lee: " + leer());
		}
	}

		
	static class Escritor implements Runnable {
			private final int id;

			Escritor(int id) {
				this.id = id;
			}

			@Override
			public void run() {
				int nuevoValor = (int) (Math.random() * 10001);
				escribir(nuevoValor);
				System.out.println("Escritor " + id + " cambia a: " + nuevoValor);
			}
		}


	public static void main(String[] args) {
		int numLectores = 5;
		int numEscritores = 3;

		
		for (int i = 0; i < numLectores; i++) {
			new Thread(new Lector(i)).start();
		}
		
		for(int i = 0; i<numEscritores; i++) {
			new Thread(new Escritor(i)).start();
		}
		
	}

}
