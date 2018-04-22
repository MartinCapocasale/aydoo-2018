package ar.edu.untref.aydoo;


import org.junit.Assert;
import org.junit.Test;



public class TestTablero {
	
	@Test
	public void noHayBarcoEnNingunCasillero() {
		Tablero tablero = new Tablero();
		
		for(int fila = 0; fila < tablero.cantidadFilas(); fila++) {
			for(int columna = 0; columna < tablero.cantidadColumnas(); columna++) {
				Assert.assertFalse(tablero.hayBarcoEnPosicion(fila, columna));
			}
		}
	}
	
	
/*	public void hayUnBarcoDeTamanioUnoEnElCasillero11(){
		Tablero tablero = new Tablero();
		Barco unBarco = new Barco(1);
		
		int fila = 1 ;
		int columna = 1;
		SentidoBote orientacion = SentidoBote.HORIZONTAL;
		
		tablero.agregarBarcoAlTablero(unBarco,fila,columna,orientacion);
		
		Assert.assertTrue(tablero.hayBarcoEnPosicion(fila, columna));
	}*/
	

}
