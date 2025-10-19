package complejidad;

public class Orden_Complejidad {

	// 1a
	int sum = 0;
	for(int n = N;n>0;n/=2)
	{
		for (int i = 0; i < n; i++) {
			sum++;
		}
	}
	//El bucle externo se ejecuta log2(N) veces, y el interno n veces.
	//El total de operaciones es N + (N/2) + (N/4) + (N/8) + ...
	//La complejidad es: O(N)

	// 1b
	int sum = 0;
	for(int i = 1;i<N;i*=2)
	{
		for (int j = 0; j < i; j++) {
			sum++;
		}
	}
	//Este es similar pero el bucle interno es 2N
	//Complejidad: O(N)
	
	//1c
	
	int sum = 0; 
	for (int i = 1; i < N; i *= 2) {
		for (int j = 0; j < N; j++) {
			sum++;
		}
	}
	//El bucle externo es log2(N) iteraciones.
	//El bucle interno es N iteraciones por cada una del externo
	//Complejidad: O(N*log2(N))
}
}
