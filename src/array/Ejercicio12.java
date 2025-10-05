package array;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Concatene dos arrays de chars
		char[] arr1 = { 'H', 'o', 'l', 'a', ' ' };
		char[] arr2 = { 'M', 'u', 'n', 'd', 'o' };
		
		char[] junto = new char[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
            junto[i] = arr1[i];
        }
		
		for (int i = 0; i < arr2.length; i++) {
            junto[arr1.length + i] = arr2[i];
        }
		
		System.out.println("Concatenado: ");
		for (char c : junto) {
			System.out.print(c);
		}
	}

}
