package ar.edu.untref.aydoo;

public class HacedorDeCafeConLeche {
	
	private HacedorDeCafe cafetero;
	private Lechero lechero;
	
	public HacedorDeCafeConLeche() {
		
		this.cafetero = new HacedorDeCafe();
		this.lechero = new Lechero();
	}
	
	public Vaso prepararEnEsteVaso(Vaso vaso) {

		this.lechero.prepararEnEsteVaso(vaso);
		this.cafetero.prepararEnEsteVaso(vaso);
		return vaso;
	}

}
