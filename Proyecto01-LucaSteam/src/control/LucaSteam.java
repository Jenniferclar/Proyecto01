package control;

import gui.Menu;
import service.ServiciosJuego;

/**
 * @ClassName LucaSteam
 *
 * @author Mar�a Castro, Patricia Garc�a, Usoa Larrarte,
 * Jennifer P�rez y Sara Silvo
 *
 * @date 15 jun. 2021
 * 
 * @version 1.0
 */
public class LucaSteam {
	
	//Maria.Instancio servicios para poder usarla. IMPORTAR
	private ServiciosJuego servicios = new ServiciosJuegoImpl;
	
	/**
	 * Maria.
	 * M�todo para inicializar el arranque del men�
	 * Muestra men� siempre que la booleana sea true. Esta se actualiza en el m�todo seleccionOpciones()
	 */
	public void startLucaSteam() {
		boolean continuaMenu = true;
		do {
			Menu.mostrarMenu();
			continuaMenu = this.seleccionOpciones();
		} while(continuaMenu);
		System.out.println(" **FIN DE LA SESI�N** ");
	}
	
	
	/**
	 * Maria.
	 * M�todo para mostrar las dos opciones de menu
	 * @return sigueMenu
	 */
	public boolean seleccionOpciones() {
		boolean sigueMenu = true;
		try {
			switch() {
				case 1:
					//ALTA DE UN JUEGO
					servicios.altaJuego();
					break;
				case 2:
					//LISTAR JUEGOS
					servicios.listarJuegos();
					break;
			}
		}catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
        return sigueMenu;
    }

}

