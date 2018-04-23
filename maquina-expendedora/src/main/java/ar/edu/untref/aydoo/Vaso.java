package ar.edu.untref.aydoo;

public class Vaso {

	private int cantidadDeAzucar;
	private boolean te;
	private boolean cafe;
	
	public Vaso(){
		this.te = false;
		this.cafe = false;
	}
	
	public int getCantidadDeAzucar() {
		return cantidadDeAzucar ;
	}
	
	public void agregarNDeAzucar(int cantidad){
		this.cantidadDeAzucar = cantidad;
	}

	public boolean tieneAzucar() {
		boolean tieneAzucar = false;
		if(this.cantidadDeAzucar > 0){
			tieneAzucar = true;
		}
		return tieneAzucar;
	}

	public boolean agregarLeche() {
		return true;
	}
	
	public boolean tieneCafe() {	
		return this.cafe;
	}
	
	public void agregarCafe(){
		if(!this.cafe && !this.te){
			this.cafe = true;
			this.te = false;
		}
	}
	
	public void agregarTe(){
		if(!this.cafe && !this.te){
			this.te = true;
			this.cafe = false;
		}
	}

	public boolean tieneTe() {
		return this.te;
	}

}

