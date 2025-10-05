package tiposDatosYSecuenciasDeControl;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Muestre por pantalla la tabla de multiplicar de los 10 primeros números naturales.
		for (int i = 0; i<=10; i++) {
			System.out.println("Tabla del " + i);
			for(int j = 0; j<= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}

}
