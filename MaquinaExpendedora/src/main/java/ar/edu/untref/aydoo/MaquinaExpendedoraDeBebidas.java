
public class MaquinaExpendedoraDeBebidas {
	
	
	public void hacerCafeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		unVaso.agregarSustancia("cafe");
		unVaso.agregarSustancia("leche");
		unVaso.agregarNDeAzucar(cantidadAzucar);		
		
	}
	public void hacerTeConLecheConNDeAzucar(Vaso unVaso, int cantidadAzucar) {
		unVaso.agregarSustancia("te");
		unVaso.agregarSustancia("leche");
		unVaso.agregarNDeAzucar(cantidadAzucar);
		
	}



}
