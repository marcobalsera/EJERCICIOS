package html;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


//ESTO ES COMO UN POPURRÍ DE 20MIL MIERDAS DEL PDF

//Realizar un servidor que se levante en el puerto 1234 y que
//cuando recibe una petición responde con un simple ‘Ola ke ase!’.

//Realizar un servidor HTTP que se levante en el puerto 1234
//y que cuando recibe una petición responde con un HTML simple

//Realizar un servidor estático que sirva contenido
//almacenado en la misma carpeta que ejecuta el programa
//Modificar el servidor HTTP anterior para que pueda atender
//múltiples clientes concurrentes.
public class SocketDeServidor {

	public static void main(String[] args) {
		
		ServerSocket servidor;
		
		try {
			//preparo la escucha en un puerto
			servidor = new ServerSocket(1234);
			
			//espero a que el cliente establezca conexion
			Socket cliente = servidor.accept();
			
			//ahora me encargo de responder al cliente
			OutputStream salida = cliente.getOutputStream();
			PrintWriter out = new PrintWriter(salida);
			out.println("HTTP/1.0 200 OK");
			out.println("Content-Type: text/html");
			out.println(""); //Línea en blanco!!!
			out.println("<H1>Ola ke ase!</H1>");
			out.flush(); //Forzamos el envío de datos
			out.close();
			//atiendo a mi cliente
			InputStream in = cliente.getInputStream();
			BufferedReader i=new BufferedReader(new InputStreamReader(in));
			String str = i.readLine().split(" ")[1]; //Cojo la ruta que me pide
			cliente.close();
			
			
			
		}catch(IOException e) {
			System.out.println("No se pudo levantar el servidor.");
		}
		
	}

}
