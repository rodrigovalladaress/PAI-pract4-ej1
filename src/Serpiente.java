/* Rodrigo Valladares Santana L1 
 * Programación de Aplicaciones Interactivas Práctica 4
 * 
 * Ejercicio 1.
 * 
 * */

import java.util.*;
public class Serpiente {
	
	//Guarda el número de serpientes que se están moviendo
	private int numSerpientes;
	
	//Devuelve el número de serpientes que está reptando
	public int reptar() {
		return numSerpientes;
	}
	
	private void setNumSerpientes(int numSerpientes) {
		this.numSerpientes = numSerpientes;
	}
	
	Serpiente(int numSerpientes) {
		setNumSerpientes(numSerpientes);
	}

	public static void main(String[] args) {

		ArrayList serpientes = new ArrayList();
		try {
			for(int i = 0; i < args.length; i++)
				serpientes.add(new Serpiente(Integer.parseInt(args[i])));
		}
		catch(NumberFormatException noNumero) {
			System.out.println("Error: un argumento no es numérico. Serpiente <n1> <n2> ... <nm> (n = entero)");
		}
		
		for(int i = 0; i < serpientes.size(); i++) {
			//Variable auxiliar que guarda la referencia al objeto iterado y la convierte en un objeto de la clase Serpiente. 
			Serpiente auxiliar = (Serpiente)serpientes.get(i);
			System.out.println("Reptan " + auxiliar.reptar() + " serpientes.");
		}
	

	}

}