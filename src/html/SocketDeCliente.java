package html;

import java.io.IOException;
import java.net.Socket;

//Realizar un escaner de puertos abiertos, es decir, un
//programa que prueba todos los puertos TCP de una máquina para
//saber cuáles están abiertos y escuchando.
public class SocketDeCliente {

	public static void main(String[] args) {
		//primero defino el host objetivo, que en este caso es el mio
		String host = "localhost";
		
		//si le paso un argumento al programa, entonces lo toma como nombre de host objetivo o IP destino
		if(args.length > 0) {
			host = args[0];
		}
		
		//pruebo desde los puertos 0 hasta 1023 (no se por qué pruebo solo con estos, pero entiendo que me lo dirian)
		for(int i = 0; i < 1024 ; i++) {
			try {
				//intenta abrir una conexión TCP al host en el puerto i
				//si lo consigue printea y avisa y printea
				 Socket c = new Socket(host, i);
				 System.out.println("El puerto " + i + " está abierto.");
			}catch (IOException e) {
				//si pasa algo printea
				System.out.println("El puerto " + i + " está cerrado.");
			}
		}

	}
}
