package ar.edu.untref.aydoo;

public class Casillero {

	private Barco unBarco;
	
	public Casillero() {
		this.unBarco = null;
		
	}
	public boolean estaVacio() {
		
		return this.unBarco == null;
	}

	public void ponerBarco(Barco unBarco) {
		this.unBarco = unBarco;
	}

}
