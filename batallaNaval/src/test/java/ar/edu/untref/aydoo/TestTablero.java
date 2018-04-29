package ar.edu.untref.aydoo;


import org.junit.Assert;
import org.junit.Test;

public class TestTablero {
	
	@Test
	public void noHayBarcoEnNingunCasillero() {
		Tablero tablero = new Tablero();	
		for(int fila = 1; fila < tablero.cantidadDeFilas(); fila++) {
			for(int columna = 1; columna < tablero.cantidadDeColumnas(); columna++) {
				Assert.assertFalse(tablero.hayBarcoEnPosicion(fila, columna));
			}
		}
	}
	
	@Test
	public void hayUnBarcoDeTamanioUnoEnElCasillero11ConSentidoHorizontal(){
		Tablero tablero = new Tablero();
		Barco unBarco = new Barco(1);
		
		int fila = 1 ;
		int columna = 1;
		SentidoBote orientacion = SentidoBote.HORIZONTAL;
		
		tablero.agregarBarcoAlTablero(unBarco,fila,columna,orientacion);
		Assert.assertTrue(tablero.hayBarcoEnPosicion(fila, columna));
	}
	
	@Test
	public void hayUnBarcoDeTamanioDosEnElCasillero11ConSentidoHorizontal(){
		Tablero tablero = new Tablero();
		Barco unBarco = new Barco(2);
		
		int fila = 1 ;
		int columna = 1;
		SentidoBote orientacion = SentidoBote.HORIZONTAL;
		
		tablero.agregarBarcoAlTablero(unBarco,fila,columna,orientacion);
		Assert.assertTrue(tablero.hayBarcoEnPosicion(fila, columna));
		Assert.assertTrue(tablero.hayBarcoEnPosicion(fila, columna++));
	}
	
	@Test
	public void hayUnBarcoDeTamanioUnoEnElCasillero11ConSentidoVertical(){
		Tablero tablero = new Tablero();
		Barco unBarco = new Barco(1);
		
		int fila = 1 ;
		int columna = 1;
		SentidoBote orientacion = SentidoBote.VERTICAL;
		
		tablero.agregarBarcoAlTablero(unBarco,fila,columna,orientacion);
		Assert.assertTrue(tablero.hayBarcoEnPosicion(fila, columna));
	}


}
