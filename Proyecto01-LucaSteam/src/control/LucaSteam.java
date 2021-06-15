package control;


import gui.Menu;
import gui.MenuCargaCatalogo;
import service.ServiciosJuego;
import service.ServiciosJuegoImpl;
import utilities.Teclado;

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
	
	/**
	 * Maria. 
	 * Instancio servicios para poder usarla. IMPORTAR
	 * Atributo servicios
	 */
	private ServiciosJuego servicios = new ServiciosJuegoImpl();
	
	/**
	 * Maria.
	 * M�todo para inicializar el arranque del men�
	 * Muestra men� siempre que la booleana sea true. Esta se actualiza en el m�todo seleccionOpciones()
	 *//*
	public void startLucaSteam() {
		//Men� inicial de carga de Cat�logo
		boolean continuaMenu1 = true;
		do {
			MenuCargaCatalogo.mostrarMenuCargaCatalogo();
			continuaMenu1 = this.opcionesMenuCarga();
		} while(continuaMenu1);
	
		
		//Men� principal
		boolean continuaMenu2 = true;
		do {
			Menu.mostrarMenu();
			continuaMenu2 = this.seleccionOpciones();
		} while(continuaMenu2);
		System.out.println(" **FIN DE LA SESI�N** ");
	}*/
	/*
	public boolean opcionesMenuCarga() {
		boolean sigueMenu1 = true;
		try {
			switch(Teclado.tecladoInt()) {
				case 1:
					//CARGA DESDE BBDD
					servicios.deSerializarCatalogo();
					sigueMenu1 = false;
					break;
				case 2:
					//CARGA DESDE FICHERO
					servicios.leerFichero();
					sigueMenu1 = false;
					break;
				case 3:
					//CAT�LOGO VAC�O
					sigueMenu1 = false;
					break;
			}
		}catch (Exception e) {
            System.out.println("error: " + e.toString());
        }
        return sigueMenu;
    }*/
	
	/**
	 * Maria.
	 * M�todo para mostrar las dos opciones de menu
	 * @return sigueMenu
	 */
	/*
	public boolean seleccionOpciones() {
		boolean sigueMenu = true;
		try {
			switch(Teclado.tecladoInt()) {
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
    }*/

}

