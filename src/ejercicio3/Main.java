package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Declaramos variables
		int numVeces, valorMax, valorMin;
		//Creamos el Scanner 
		Scanner read= new Scanner (System.in);
		
		//Solicitamos al usuario datos
		System.out.println("Introduzca el número de veces que quiera generar un número: ");
		//Leemos dato
		numVeces=read.nextInt();
		System.out.println("Introduzca el valor máx al que desea llegar: ");
		//Leemos dato
		valorMax=read.nextInt();
		System.out.println("Introduzca el valor mínimo del que desea partir: ");
		//Leemos dato
		valorMin=read.nextInt();
		
		//Llamamos a las funciones de la clase NumerosAleatorios.
		NumerosAleatorios.numAleat1(numVeces);
		NumerosAleatorios.numAleat2(numVeces,valorMax);
		NumerosAleatorios.numAleat3(numVeces, valorMax,valorMin);
		
		//Finalmente, cerramos el Scanner 
		read.close();

	}

}
