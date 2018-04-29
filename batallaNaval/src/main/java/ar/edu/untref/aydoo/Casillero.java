package ar.edu.untref.aydoo;



public class Casillero {
	
	private Barco barco;
	private EstadoDeCasillero estado;

	public Casillero() {
		this.barco = null;
		this.estado = EstadoDeCasillero.AGUA;
	}
	
	public boolean estaVacio() {
		return this.barco == null;
	}

	public void ponerBarco(Barco unBarco){
		this.barco = unBarco;
	}
	
	public Barco obtenerBarco() {
		return this.barco;
	}
	
	public EstadoDeCasillero obtenerEstado() throws Exception {
		if(this.barco != null) {
			if(this.barco.estaHundido()) {
				this.estado = EstadoDeCasillero.HUNDIDO;
			}
			else{
				this.barco.tocado();
				if(this.barco.estaHundido()) {
					this.estado = EstadoDeCasillero.HUNDIDO;
				}else{
					this.estado = EstadoDeCasillero.TOCADO;
				}
			}
		}
		return this.estado;
	}
}	