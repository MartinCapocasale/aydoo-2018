
public class Vaso {

	private int cantidadDeAzucar;
	private boolean te = false;
	private boolean cafe = false;
	
	
	
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
		if(!cafe && !te){
			cafe = true;
			te = false;
		}
		return cafe;
	}

	public boolean tieneTe() {
		if(!cafe && !te){
			te = true;
			cafe = false;
		}
		return te;
	}


}
