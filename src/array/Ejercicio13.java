package array;

import java.util.Arrays;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Divida un array en segmentos (otros arrays) de un tamaño fijo especificado
		// a través de un entero. Si el último segmento no llega al tamaño especificado,
		// tendrá el tamaño inferior correspondiente. Por ejemplo, si debe dividir un
		// array de 23 elementos en segmentos de tamaño 5, acabará teniendo 4 arrays de
		// 5 elementos y 1 array de 3 elementos

		int[] array = new int[23];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1; // 1,2,3,...23
		}
		int tamSegmento = 5;
		int numSegmentos = array.length / tamSegmento;
		if (array.length % tamSegmento != 0) {
			numSegmentos++; // si sobra, sumamos uno más
		}

		int[][] segmentos = new int[numSegmentos][]; // array de arrays
		int indice = 0; // índice del array original
		for (int i = 0; i < numSegmentos; i++) {
			int size;
			if (indice + tamSegmento <= array.length) {
				size = tamSegmento;
			} else {
				size = array.length - indice;
			}
			int[] subarray = new int[size];
			for (int j = 0; j < size; j++) {
				subarray[j] = array[indice++];
			}

			segmentos[i] = subarray;
		}
		for (int i = 0; i < segmentos.length; i++) {
			System.out.println("Segmento " + (i + 1) + ": " + Arrays.toString(segmentos[i]));
		}
	}
}
