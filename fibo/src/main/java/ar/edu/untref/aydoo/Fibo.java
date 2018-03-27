package ar.edu.untref.aydoo;
import java.util.LinkedList;
public class Fibo {
		
			private int numA;
			private int numB;
			private int numC;
			private LinkedList<Integer> array;
			
			public Fibo(){
				this.array = new LinkedList<Integer>();
				this.numA = 0;
				this.numB = 0;
				this.numC = 1;
			}	
			
			public void calcularFibonacci(int n){
				
				this.array.add(this.numB);
				this.array.add(this.numC);
				
				    for(int i = 3; i<=n; i++){
				    	this.numA = this.numB;
				    	this.numB = this.numC;
				    	this.numC = this.numA + this.numB;
				    	this.array.add(this.numC);
				    	
				    }
				       			
			}	
			public LinkedList imprimir(){
			
					return this.array;
			}
}
