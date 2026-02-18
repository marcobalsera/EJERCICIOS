package html;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DescargaArchivoMejorada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream entrada = null;
		OutputStream salida = null;

		try {
			URL unaPagina = new URL("https://i.blogs.es/26e43a/nintendo-3ds-roja-grande/450_1000.jpg");
			entrada = unaPagina.openStream();
			salida = new FileOutputStream("nintendo3ds.jpg");
			byte buf[] = new byte[4096];
			int n;
			while ((n = entrada.read(buf)) != -1) { //esto usa lectura y escritura en bloques de 4KB
				//esto va llenando arrays de 4KB y luego los manda todos juntos, haciendolo más rápido
				salida.write(buf, 0, n);
				//esta ultima linea escribe los primeros n bytes de buf, empezando por el 0
				//con esto consigo que si el array no esté completo, se escriban los bytes que hay.
			}
			salida.flush();
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
