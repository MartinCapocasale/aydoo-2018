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
	public void hayUnBarcoDeTamanioUnoEnElCasillero11ConSentidoHorizontal() throws Exception {
		Tablero tablero = new Tablero();
		Barco unBarco = new Barco(1);
		
		int fila = 1 ;
		int columna = 1;
		SentidoBote orientacion = SentidoBote.HORIZONTAL;
		
		tablero.agregarBarcoAlTablero(unBarco,fila,columna,orientacion);
		Assert.assertTrue(tablero.hayBarcoEnPosicion(fila, columna));
	}
	
	@Test
	public void hayUnBarcoDeTamanioDosEnElCasillero11ConSentidoHorizontal() throws Exception{
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
	public void hayUnBarcoDeTamanioUnoEnElCasillero11ConSentidoVertical() throws Exception{
		Tablero tablero = new Tablero();
		Barco unBarco = new Barco(1);
		
		int fila = 1 ;
		int columna = 1;
		SentidoBote orientacion = SentidoBote.VERTICAL;
		
		tablero.agregarBarcoAlTablero(unBarco,fila,columna,orientacion);
		Assert.assertTrue(tablero.hayBarcoEnPosicion(fila, columna));
	}
	
	@Test
	public void hayUnBarcoDeTamanioDosEnElCasillero11ConSentidoVertical() throws Exception{
		Tablero tablero = new Tablero();
		Barco unBarco = new Barco(2);
		
		int fila = 1 ;
		int columna = 1;
		SentidoBote orientacion = SentidoBote.VERTICAL;
		
		tablero.agregarBarcoAlTablero(unBarco,fila,columna,orientacion);
		Assert.assertTrue(tablero.hayBarcoEnPosicion(fila, columna));
		Assert.assertTrue(tablero.hayBarcoEnPosicion(fila++, columna));
	}
	
	@Test
	public void noPuedeHaberDosBarcosDeTamanioUnoEnLaMismaPosicion() throws Exception{
		Tablero tablero = new Tablero();
		Barco unBarco = new Barco(1);
		Barco otroBarco = new Barco(1);
		
		int fila = 1 ;
		int columna = 1;
		SentidoBote orientacion = SentidoBote.VERTICAL;
		
		tablero.agregarBarcoAlTablero(unBarco,fila,columna,orientacion);
	
		
		try {
			tablero.agregarBarcoAlTablero(otroBarco,fila,columna,orientacion);
		}
		catch(ExcepcionBarcoSuperpuesto excepcion) {
			
		}
	}
	
	@Test
	public void noPuedeHaberUnBarcoDeTamanioUnoUbicadoFueraDeltableroConSentidoVertical() throws Exception{
		Tablero tablero = new Tablero();
		Barco unBarco = new Barco(1);
				
		int fila = 6 ;
		int columna = 1;
		SentidoBote orientacion = SentidoBote.VERTICAL;
		
		
		try {
			tablero.agregarBarcoAlTablero(unBarco,fila,columna,orientacion);
		}
		catch(Exception excepcion) {
			
		}
	}
	
	@Test
	public void noPuedeHaberUnBarcoDeTamanioDosUbicadoFueraDeltableroconsentidoHorizontal() throws Exception{
		Tablero tablero = new Tablero();
		Barco unBarco = new Barco(2);
				
		int fila = 1 ;
		int columna = 7;
		SentidoBote orientacion = SentidoBote.HORIZONTAL;
		
		
		try {
			tablero.agregarBarcoAlTablero(unBarco,fila,columna,orientacion);
		}
		catch(Exception excepcion) {
			
		}
	}
	
}
