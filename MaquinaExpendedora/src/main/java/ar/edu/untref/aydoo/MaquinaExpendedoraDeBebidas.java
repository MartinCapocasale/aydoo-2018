package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {
	
	
	public void hacerCafeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		unVaso.agregarSustancia("cafe");
		unVaso.agregarLeche();
		unVaso.agregarNDeAzucar(cantidadAzucar);		
		
	}
	public void hacerTeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		unVaso.agregarSustancia("te");
		unVaso.agregarLeche();
		unVaso.agregarNDeAzucar(cantidadAzucar);
		
	}



}
