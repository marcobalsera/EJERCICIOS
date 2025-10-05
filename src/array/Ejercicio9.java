package array;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invierta el orden de los elementos de un array de chars.
		char[] arr = { 'H', 'o', 'l', 'a' };

		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		System.out.print("Array invertido: ");
		for (char c : arr) {
			System.out.println(c);
		}
	}

}
