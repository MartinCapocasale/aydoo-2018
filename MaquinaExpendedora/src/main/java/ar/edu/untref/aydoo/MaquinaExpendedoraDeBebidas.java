
public class MaquinaExpendedoraDeBebidas {
	
	
	public void hacerCafeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		unVaso.tieneCafe();
		unVaso.agregarLeche();
		unVaso.agregarNDeAzucar(cantidadAzucar);		
		
	}
	public void hacerTeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		unVaso.tieneTe();
		unVaso.agregarLeche();
		unVaso.agregarNDeAzucar(cantidadAzucar);
		
	}



}
