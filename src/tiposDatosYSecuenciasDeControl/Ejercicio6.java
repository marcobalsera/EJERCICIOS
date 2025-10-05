package tiposDatosYSecuenciasDeControl;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Muestre por pantalla la lista de los 100 primeros números primos
		int c = 0;
		int pr = 2; // primer número primo

		while (c < 100) { // se repite el codigo hasta q se encuentren 100 numeros
			boolean primo = true; //asume que el numero es primo, la uso para encontrar divisores
			if (pr < 2) { //no hace falta, pero si es menor q dos, no es primo
				primo = false;
			} else {
				for (int i = 2; i * i <= pr; i++) { // prueba todos los posibles divisores desde
					//2 hasta la raiz cuadrada de pr. Para saber si un numero es primo, basta con 
					//saber sus divisores hasta la raiz cuadrada. Ejemplo con 49, cuya raiz es 7:
					//si no hay un numero <=7 que divida a 49, entonces es q es primo.
					// El 1 no cuenta
					if (pr % i == 0) { //compruebo si i divide de forma exacta a pr
						primo = false;//si lo divide de forma exacta, no es primo
						break;//salgo del bucle
					}
				}
			}
				//SIGO DENTRO DEL WHILE
			if (primo) {//si es primo = true
				System.out.println(pr); //muestro por pantalla
				c++; //aumento el contador
			}

			pr++;// aumento el numero para la siguiente comprobacion del while

		}

	}

}
