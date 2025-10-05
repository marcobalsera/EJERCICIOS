package array;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Haga lo mismo que el ejercicio anterior, pero ahora usando un array de chars 
		//con la representación en hexadecimal de los dígitos. Es decir, que siga la siguiente secuencia:
		//0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F, 0, 1, 2, ...
		char[] array = new char[300];
		char[] digithexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		for (int i=0; i<array.length; i++) {
			array[i] = digithexa[i % 16];
		}
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

}
