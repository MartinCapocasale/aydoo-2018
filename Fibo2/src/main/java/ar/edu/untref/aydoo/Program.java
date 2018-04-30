package ar.edu.untref.aydoo;
public class Program {


	public static final void main(String[] args)  {
		
		
		int numeroIngresado = Integer.parseInt(args[0]);
		Fibo nuevoFibonacci = new Fibo();
	
		
			if(numeroIngresado < 2 ){
				System.out.println("ingrese un numero mayor a 1");
			}
		
			else{
				nuevoFibonacci.calcularFibonacci(numeroIngresado);
				System.out.println("fibo " + "<" + numeroIngresado + ">" + ":" + nuevoFibonacci.imprimir());
				
			} 
	}			

}
