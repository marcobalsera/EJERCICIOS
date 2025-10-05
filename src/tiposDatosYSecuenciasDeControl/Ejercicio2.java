package tiposDatosYSecuenciasDeControl;


public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Muestre por pantalla los mayores números enteros que se pueden representar mediante un
	//char, un short y un int.
	char c = Character.MAX_VALUE; //esto no me devuelve nada
	short s = Short.MAX_VALUE;
	int i = Integer.MAX_VALUE;
	
	System.out.println((int)c);//pa que me de un valor tengo que hacer cast a integer
	System.out.println(s);
	System.out.println(i);
	}

}
