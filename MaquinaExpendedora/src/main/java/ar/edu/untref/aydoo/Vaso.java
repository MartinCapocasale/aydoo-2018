
public class Vaso {

	private String sustancia;
	private int cantidadDeAzucar;
	
	
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
		
	public void agregarSustancia(String unaSustancia){
		this.sustancia = unaSustancia;
		
	}
	
	public String getSustancia(){
		return this.sustancia;
	}
	
	
	public boolean tieneCafe() {
		boolean tieneCafe = false;
		if(this.sustancia == "cafe" ){
			tieneCafe = true;
		}
		return tieneCafe;
	}

	public boolean tieneTe() {
		boolean tieneTe = false;
		if(this.sustancia == "te" ){
			tieneTe = true;
		}
		return tieneTe;
	}
	
	public boolean tieneLeche() {
		boolean tieneLeche = false;
		if(this.sustancia == "leche" ){
			tieneLeche = true;
		}
		return tieneLeche;
	}

}
