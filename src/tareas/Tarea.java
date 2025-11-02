package tareas;

import java.util.concurrent.Callable;
//maximo comun divisor
//tarea no es un thread, sino q es una tarea q ejecuta un thread
public class Tarea implements Callable<Integer>{

	private int num1;
	private int num2;
	
	public Tarea(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	//call() si devuelve algo
	public Integer call() throws Exception {
		//Calculo el MCD 
		int resto = num1 % num2;
		while (resto != 0) {
			int nuevoResto = num2 % resto;
			num2 = resto;
			resto = nuevoResto;
		}
		return num2;
	}

	
}
