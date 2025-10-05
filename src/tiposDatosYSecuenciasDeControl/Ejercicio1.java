package tiposDatosYSecuenciasDeControl;

public class Ejercicio1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Defina variables que representen el número de días de un año, el número de horas que
	//tiene un día, el número de minutos que tiene una hora y el número de segundos que tiene
	//un minuto. Emplee las variables que ocupen el mínimo espacio de memoria posible. A
	//continuación, calcule el número de segundos que tiene un año y almacene el valor de dicho
	//cálculo en otra variable.
		
	int d = 365;
	int h = 24;
	int m = 60;
	int s = 60;
	
	int seg_year = s*m*h*d;
	System.out.println(seg_year);

	}

}
