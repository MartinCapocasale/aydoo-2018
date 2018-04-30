package ar.edu.untref.aydoo;

public class ExcepcionBarcoSuperpuesto extends Exception{
	
	public ExcepcionBarcoSuperpuesto() {
		super("No se puede agregar un barco en una posicion ocupada");
		
	}
	
}
