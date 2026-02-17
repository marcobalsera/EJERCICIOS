package html;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;

public class DescargaInspeccion {

	public static void main(String[] args) {
		
		InputStream fichBytes = null;
		OutputStream salidaBytes = null;
		
		try {
			URL pagina = new URL("http://web.dit.upm.es/index.html");
			fichBytes = pagina.openStream();
			
			//me defino mi reader1 como entrada de datos con el fichero de bytes
			InputStreamReader reader1 = new InputStreamReader(fichBytes);
			//ahora me creo un buffer para especializar el flujo de texto
			BufferedReader fichTxt = new BufferedReader(reader1);
			
			String textoOriginal = "", linea; //declara dos variables, una que vale "" y otra sin inicializar
			
			//le asigna la variable fichTxt.readLine a linea
			//mientras haya contenido se ejecuta el bucle
			while((linea = fichTxt.readLine()) != null) {
				//ahora concateno el nuevo texto al texto original, si antes era "Hola" y linea es "mundo", es "Hola mundo"
				textoOriginal += linea;
			}
			//ahora del texto modificado veo el encabezado vacío y lo sustituyo por lo que quiero
			String textoModificado = textoOriginal.replace("<h2></h2>", "<h2>HOLA</h2>");
			
			//creo un flujo de salida hacia un documento, que si no existe lo crea automaticamente
			salidaBytes = new FileOutputStream("doc1.html");
			//envuelve el flujo de salida en un printWriter, para poder imprimirlo de froma mas facil
			PrintWriter salidaTxt = new PrintWriter(salidaBytes);
			//printeo
			salidaTxt.print(textoModificado);
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
