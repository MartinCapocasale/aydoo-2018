package ar.edu.untref.aydoo;

public class MaquinaExpendedoraDeBebidas {
	
	private HacedorDeCafeConLeche hacedorDeCafe;
	private HacedorDeTeConLeche hacedorDeTe;
	private Azucarero azucarero;
	
	public MaquinaExpendedoraDeBebidas() {
		this.hacedorDeCafe = new HacedorDeCafeConLeche();
		this.hacedorDeTe = new HacedorDeTeConLeche();
		this.azucarero = new Azucarero();
	}
	
	public void hacerCafeConLecheConNDeAzucar(Vaso vaso, int cantDeAzucar) {
		this.hacedorDeCafe.prepararEnEsteVaso(vaso);
		this.azucarero.agregarNDeAzucar(vaso, cantDeAzucar);		
		
	}
	public void hacerTeConLecheConNDeAzucar(Vaso vaso, int cantDeAzucar) {
		this.hacedorDeTe.prepararEnEsteVaso(vaso);
		this.azucarero.agregarNDeAzucar(vaso, cantDeAzucar);	
		
	}

}
