package utilities;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import dao.AltaJuego;
import dao.CatalogoJuegos;
import dao.Juego;
import control.LucaSteam;
/**
 * @ClassName LeerFichero
 *
 * @author Mar�a Castro, Patricia Garc�a, Usoa Larrarte,
 * Jennifer P�rez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class LeerFichero {

	/**
	 * Lee el fichero de entrada (formato .csv) que contiene la coleccion de juegos y guarda cada juego completo
	 * (rango, nombre, plataforma, ano, genero, editor y ventas Europa) como un elemento en el mapa
	 */
	private static final String RUTA = "CSVDatosSelecPorComas.csv";

	public static LinkedHashMap<String, Juego> leerDatosFichero() {
		LinkedHashMap<String, Juego> mapaJuego = new LinkedHashMap<>();

		File archivo = new File(RUTA);
		FileReader fr = null;
		try {
			fr = new FileReader("CSVDatosSelecPorComas.csv");

			BufferedReader br = new BufferedReader(fr);

			String linea;
			while ((linea = br.readLine()) != null) {
				String[] JuegoString = linea.split(",");// convierte cada l�nea en array separado por las comas 
															
				Juego AltaJuego = arrayToJuegos(JuegoString);
				mapaJuego.put(AltaJuego.getNombre().toUpperCase(), AltaJuego);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepci�n.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return mapaJuego;

	}
	
	/**
	 * Guarda en un array las tuplas de cada juego. Rango en la posici�n 0, nombre en la 1, 
	 * plataforma en la 2, ano en la 3, genero en la 4, editor en la 5 y ventas de Europa en la 6.
	 * @param juegoString      array tipo String: incluye los datos completos de un juego
	 * @return altaJuego
	 */
	private static Juego arrayToJuegos(String[] juegoString) {
		Integer rango = Integer.valueOf(juegoString[0].replace(" ", ""));
		String nombre = String.valueOf(juegoString[1].replace(" ", ""));
		String plataforma = String.valueOf(juegoString[2].replace(" ", ""));
		Integer ano = Integer.valueOf(juegoString[3].replace(" ", ""));
		String genero = String.valueOf(juegoString[4].replace(" ", ""));
		String editor = String.valueOf(juegoString[5].replace(" ", ""));
		String ventas = String.valueOf(juegoString[6].replace(" ", ""));

		Juego altaJuego = new Juego (rango, nombre, plataforma, ano, genero, editor, ventas);

		return altaJuego;
	}
	/**
	 * Imprime por consola la tupla de cada juego separado por comas
	 * @param juego
	 * @return
	 */
	private static String juegoToLine(Juego juego) {

		

		return juego.getRango() + "," + juego.getNombre() + juego.getPlataforma() +  "," + juego.getAno() + "," + juego.getGenero() + "," + juego.getEditor() + "," + juego.getVentas();

		

	}

	/**
	 * Guarda en un fichero la colecci�n de los juegos
	 * @param catalogo
	 * @throws LucaSteam
	 */
	public static void guardarDatosJuego(Catalogo catalogo) throws LucaSteam {

//			File fichero = new File(RUTA);
//			if (fichero.delete()) {
//				System.out.println("Fichero eliminado");
//			}

		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter(RUTA);
			pw = new PrintWriter(fichero);

			for (Entry<String, Juego> entry : catalogo.getMapaJuegos().entrySet()) {
				pw.println(juegoToLine(entry.getValue()));

			}

		} catch (Exception e) {
			throw new LucaSteam("Error al guardarlo en archivo");
		} finally {
			try {
				// Aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}


