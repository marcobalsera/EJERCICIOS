package estructurasDatos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionarios {

	public static void main(String[] args) {
		
		Map<String, Float> notas = new HashMap<String, Float>();
		notas.put("Alvaro", 2.0f);
		notas.put("Manuel", 2.5f);
		notas.put("Lucía", 10.0f);
		
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		if(notas.containsKey(nombre)) {
		System.out.println(nombre + " es un " + notas.get(nombre));
		}else {
			System.out.println("No existe estudiante");
		}
		
		//Java extends Thread, implementa run(), se lanza con start()
		
		//Threads acaban al final de run(), y un proceso acaba al final de main() y todos los run()
		//o con exit(), o cuando una excepcion sale de main() o un run()
	}

}
