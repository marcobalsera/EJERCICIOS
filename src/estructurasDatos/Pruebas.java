package estructurasDatos;

public class Pruebas {

	public static void main(String[] args) {
		
		Node primero = new Node(7); //cuando un objeto se queda sin referencias, se borra
		Node segundo = new Node(3);
		primero.setNext(segundo);
		Node tercero = new Node(10);
		tercero.setNext(segundo);
		
		LinkedList lista = new LinkedList(primero);
		
		//solo puedo usar principio
		Node principio = primero;
		lista.getPrimero().getNext();
		
		// A -> B -> C
		// B.Next = C
		
		// A -> B -> D -> C
		//   <-   <-   <-   También hay flechitas así
		// D.Prev = B
		// C.Prev = D
		// D.Next = B.Next
		// B.Next = D
		//La flecha de B, si no apunta a C, se pierde la referencia de C, por lo q hay q "definir"
		//primero a C mediante B.Next. Sería: "el siguiente a D es el siguiente a B"
		
		
		//Añadir al final PA CASA
	}

}
