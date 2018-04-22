package ar.edu.untref.aydoo;


public class Tablero {

	private final int ancho = 5;
	private final int largo = 5;
	private Casillero[][] casilleros;
	
	public Tablero() {
		
		this.casilleros = new Casillero[largo][ancho];
		for(int fila = 0; fila < this.cantidadFilas(); fila++) {
			for(int columna = 0; columna < this.cantidadColumnas(); columna++) {
				casilleros = new Casillero[fila][columna];
			}
		}
	}
	
	public int cantidadColumnas() {
		return this.ancho;
	}

	public int cantidadFilas() {
		return this.largo;
	}

	public boolean hayBarcoEnPosicion(int fila, int columna) {
		return false;

	}

	public void agregarBarcoAlTablero(Barco unBarco, int fila, int columna, SentidoBote orientacion) {
		this.casilleros[largo][ancho].ponerBarco(unBarco);
		
	}
	
	

}
