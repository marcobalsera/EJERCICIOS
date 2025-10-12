package complejidad;

public class TorreHanoi {
	
	public static void moverDisco(int n, char origen, char destino, char auxiliar) {
		if (n == 1) {//caso base, mueve directamente el único disco
			System.out.println("Mover el disco 1 de " + origen + " a " + destino);
		} else {//caso recursivo con n>1
			moverDisco(n-1, origen, auxiliar, destino);//mueve el n-1 disco desde origen hasta auxiliar, usando destino como auxiliar
			System.out.println("Mover disco " + n + " de " + origen + " a " + destino);//mover el disco mas grande
			moverDisco(n-1, auxiliar, destino, origen);//mueve el disco n-1 desde auxiliar hasta destino usando origen como auxiliar
			//System.out representa un movimiento, por lo q se mueve un disco por vez
			//nunca se coloca un disco mayor sobre uno más peque
			//se mueve siempre el disco de encima de la torre
		}
	}
	
	public static void main (String[] args) {
		int n = 5;
		System.out.println("Resolución Torres de Hanoi con " + n + " discos:\n");
		moverDisco(n, 'A', 'B', 'C');
	}

}
