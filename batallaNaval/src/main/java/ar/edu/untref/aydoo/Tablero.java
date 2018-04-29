package ar.edu.untref.aydoo;


public class Tablero {

	private final int columnas = 5;
	private final int filas = 5;
	private Casillero[][] casilleros;
	
	public Tablero() {
		this.casilleros = new Casillero[filas][columnas];
		for(int fila = 1; fila < this.filas; fila++) {
		for(int columna = 1; columna < this.columnas; columna++) {
				this.casilleros[fila][columna] = new Casillero();
			}
		}
	}
	
	public int cantidadDeColumnas() {
		return this.filas;
	}

	public int cantidadDeFilas() {
		return this.columnas;
	}

	public void agregarBarcoAlTablero(Barco unBarco, int fila, int columna, SentidoBote orientacion){
		this.casilleros[fila][columna].ponerBarco(unBarco);
		if(unBarco.obtenerTamanio() < 1) {
			if (orientacion.equals(SentidoBote.VERTICAL)) {
				fila++;	
				this.casilleros[fila][columna].ponerBarco(unBarco);
			}
			else if(orientacion.equals(SentidoBote.HORIZONTAL)){
				columna++;		
				this.casilleros[fila][columna].ponerBarco(unBarco);
			}
		}
	}
	
	public boolean hayBarcoEnPosicion(int fila, int columna) {
		return !this.casilleros[fila][columna].estaVacio();
	}

}