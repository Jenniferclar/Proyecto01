package dao;

import java.util.HashMap;
import java.util.Map;
import model.Juego;
import exception.JuegoException;

/**
 * @ClassName CatalogoJuegosImpl
 * Implementaci�n de la Interface C�talogoJuegos
 * 
 * @author Mar�a Castro, Patricia Garc�a, Usoa Larrarte,
 * Jennifer P�rez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class CatalogoJuegosImpl implements CatalogoJuegos {
	
	/**
	 * Atributo catalogo
	 * 
	 */
	private Map<Integer, Juego> catalogo;
	
	/**
	 * Constructor de la clase CatalogoJuegos
	 *
	 */
	public CatalogoJuegosImpl() {
		catalogo = new HashMap<>();
	}

	/**
	 * M�todo getter del atributo catalogo
	 *
	 * @return catalogo
	 */
	public Map<Integer, Juego> getCatalogo() {
		return catalogo;
	}

	/**
	 * M�todo setter del atributo catalogo
	 *
	 * @param catalogo to set catalogo 
	 */
	public void setCatalogo(Map<Integer, Juego> catalogo) {
		this.catalogo = catalogo;
	}
	
	/**
	 * Implementaci�n/Sobrescritura del m�todo altaJuego
	 * 
	 * Da de alta un juego si su ID no est� repetido en el cat�logo
	 * Si el ID existe en el catalogo, lanza una excepci�n
	 *
	 * @param id
	 * @param juego
	 * @return boolean
	 * @throws JuegoException
	 */
	public boolean altaJuego(Integer id, Juego juego) throws JuegoException {
		if (catalogo.containsKey(juego)) {
			throw new JuegoException("No se puede dar de alta el juego. El ID est� repetido. ", 2);
		} else {
			catalogo.put(id, juego);
			return true;
		}
	}
	
	/**
	 * Implementaci�n/Sobrescritura del m�todo siguienteId
	 * 
	 * Busca el �ltimo ID existente en el cat�logo y devuelve el entero siguiente
	 *
	 * @return maxID+1
	 */
	public Integer siguienteId() {
		Integer maxId = catalogo.entrySet().stream()
		.max((a,b) -> Integer.compare(a.getKey(), b.getKey()))
		.map(e-> e.getKey())
		.get();
		return maxId+1;
	}

}
