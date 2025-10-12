package complejidad;

public class TrianguloFichas {

	//ALGORITMO SOLO (implementar esto me cuesta)
	
	//ALGORITMO Resolver(tablero)
	//Caso base: si no hay movimientos posibles, contar fichas restantes
	//Si fichasRestantes < mejor_solucion , guardar mejor_solucion
	
	//Para cada movimiento válido (origen, salto, destino)
	//Si tablero[origen] = 1 & tablero[salto] = 1 & tablero[destino] = 0 , entonces:
	//tablero[origen] ← 0
    //tablero[saltada] ← 0
    //tablero[destino] ← 1
	//Llamada recursiva: Resolver(tablero)
	//Deshacer movimiento:
	//tablero[origen] ← 1
    //tablero[saltada] ← 1
    //tablero[destino] ← 0
	
	//MAIN
	
	//Inicio:
	//creo tablero con todas las posiciones = 1
	//elijo posición inicial vacía
	//mejor_solucion ← número de fichas inicial (15)
	
	//Resolver(tablero)
	//muestro mejor_solucion encontrada

}
