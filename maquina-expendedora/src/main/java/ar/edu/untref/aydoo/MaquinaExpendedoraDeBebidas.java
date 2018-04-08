package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {
	
	
	public void hacerCafeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		unVaso.agregarCafe();
		unVaso.agregarLeche();
		unVaso.agregarNDeAzucar(cantidadAzucar);		
		
	}
	public void hacerTeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		unVaso.agregarTe();
		unVaso.agregarLeche();
		unVaso.agregarNDeAzucar(cantidadAzucar);
		
	}

}
