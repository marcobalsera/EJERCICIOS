package tareas;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LanzadorTareas {

	public static void main(String[] args) {
		try {
		int cores = Runtime.getRuntime().availableProcessors();
		ExecutorService executor = Executors.newFixedThreadPool(cores);
		//Executor service es para saber cuantos threads puedo lanzar a la vez
		
		//Para ejecutar un thread primero tengo que crear una tarea
		Callable<Integer> tarea1 = new Tarea(20,15); //es de tipo Callable pq he dicho q lo implementa
		
		//Envía las tareas al servicio de ejecución
		Future<Integer> resultadoFuturo = executor.submit(tarea1);
		// hasta aquí se va a ir ejecutando en otro hilo aparte
		// no es un entero, es la promesa de un entero
		//Este código no se bloquea hasta que termine la tarea
		System.out.println("Hago cosas");
		
		//Espero a q termine la tarea
		//Este código se bloquea hasta que termine la tarea
		
			int resultado = resultadoFuturo.get();
			System.out.println(resultado);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
