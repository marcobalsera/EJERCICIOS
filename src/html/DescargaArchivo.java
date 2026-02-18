package html;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DescargaArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream entrada = null;
		OutputStream salida = null;

		try {
			URL unaPagina = new URL("https://i.blogs.es/26e43a/nintendo-3ds-roja-grande/450_1000.jpg");
			entrada = unaPagina.openStream(); //abro el flujo de texto
			salida = new FileOutputStream("nintendo3ds.jpg");
			int b = entrada.read();
			while (b != -1) { //mientras que haya algo
				salida.write(b); //lo pone en el ficero de salida
				b = entrada.read(); //esto ni idea
			}
			salida.flush(); //flush es como eliminar cosas en memoria por si acaso
		} catch (Exception e) {
		}

		finally {
			if (entrada != null)
				try {
					entrada.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (salida != null)
				try {
					salida.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
