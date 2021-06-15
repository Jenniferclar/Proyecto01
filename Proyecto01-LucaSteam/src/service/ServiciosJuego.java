package service;
import exception.JuegoException;
import model.Juego;

/**
 * @ClassName ServiciosJuego
 *
 * @author Mar�a Castro, Patricia Garc�a, Usoa Larrarte,
 * Jennifer P�rez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public interface ServiciosJuego {
	
	public boolean altaJuego() throws JuegoException;
	public boolean altaJuego(Juego juego) throws JuegoException;
	public void listarJuegos();

}
