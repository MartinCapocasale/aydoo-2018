package ar.edu.untref.aydoo;

public class HacedorDeTeConLeche {
	private HacedorDeTe tetero;
	private Lechero lechero;
	
	public HacedorDeTeConLeche() {
		this.tetero = new HacedorDeTe();
		this.lechero = new Lechero();
	}
	
	public Vaso prepararEnEsteVaso(Vaso vaso) {
		this.tetero.prepararEnEsteVaso(vaso);
		this.lechero.prepararEnEsteVaso(vaso);
		
		return vaso;
		
	}
}