package utilities;

import java.util.Scanner;

/**
 * @ClassName Teclado
 *
 * @author Mar�a Castro, Patricia Garc�a, Usoa Larrarte,
 * Jennifer P�rez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */

public class Teclado {
	
	
	/**
	 * M�todo est�tico de lectura de datos del teclado
	 * @return captura del String le�do
	 * @throws Exception
	 */
	public static String tecladoString() throws Exception {
		return new Scanner(System.in).next();
	}
	
	
	/**
	 * M�todo est�tico de lectura de datos del teclado
	 * @param mensaje
	 * @return captura del String le�do
	 * @throws Exception
	 */
	public static String tecladoString(String mensaje) throws Exception {
		System.out.println(mensaje);
		return tecladoString();
	}
	
	/**
	 * M�todo est�tico de lectura de datos del teclado
	 * 
	 * @return captura del int le�do
	 * @throws Exception
	 */
	public static int tecladoInt() throws Exception{
		return new Scanner(System.in).nextInt();
	}
	
	/**
	 * M�todo est�tico de lectura de datos del teclado
	 * @param mensaje
	 * @return captura del int le�do
	 * @throws Exception
	 */
	public static int tecladoInt(String mensaje) throws Exception {
		System.out.println(mensaje);
		return tecladoInt();
	}
	
	/**
	 * M�todo est�tico de lectura de datos del teclado
	 * 
	 * @return captura del double le�do
	 * @throws Exception
	 */
	public static double tecladoDouble() throws Exception {
		return new Scanner(System.in).nextDouble();
	}
	
	/**
	 * M�todo est�tico de lectura de datos del teclado
	 * @param mensaje
	 * @return captura del double le�do
	 * @throws Exception
	 */
	public static double tecladoDouble(String mensaje) throws Exception {
		System.out.println(mensaje);
		return tecladoDouble();
	}

	/**
	 * M�todo est�tico de lectura de datos del teclado
	 * 
	 * @return captura del String le�do (captura l�nea entera)
	 * @throws Exception
	 */
	public static String tecladoLinea() throws Exception {
		return new Scanner(System.in).nextLine();
	}
	
	/**
	 * M�todo est�tico de lectura de datos del teclado
	 * @param mensaje
	 * @return captura del String le�do (captura l�nea entera)
	 * @throws Exception
	 */
	public static String tecladoLinea(String mensaje) throws Exception {
		System.out.println(mensaje);
		return tecladoLinea();
	}

}
