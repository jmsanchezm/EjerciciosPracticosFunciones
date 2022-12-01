package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numVeces, valorMax, valorMin;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca el número de veces que quiera generar un número: ");
		numVeces=read.nextInt();
		System.out.println("Introduzca el valor máx al que desea llegar: ");
		valorMax=read.nextInt();
		System.out.println("Introduzca el valor mínimo del que desea partir: ");
		valorMin=read.nextInt();
		NumerosAleatorios.numAleat1(numVeces);
		NumerosAleatorios.numAleat2(numVeces,valorMax);
		NumerosAleatorios.numAleat3(numVeces, valorMax,valorMin);
		read.close();

	}

}
