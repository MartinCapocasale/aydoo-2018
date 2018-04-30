package ar.edu.untref.aydoo;

public class ExcepcionBarcoFueraDeLimites extends Exception {
	
	public ExcepcionBarcoFueraDeLimites() {
		super("No se puede agregar un barco fuera de los limites del tablero");
		
	}

}

