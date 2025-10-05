package array;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Genere un array de 300 enteros en el que cada posición contenga su índice módulo 16. Es
		//decir, que siga la siguiente secuencia:
		//0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0, 1, 2, ...
		
		int[] array = new int[300];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i % 16;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

}
