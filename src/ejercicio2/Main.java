package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca el radio de la esfera");
		Esfera.radio=read.nextDouble();
		Esfera calculo= new Esfera ();
		System.out.println("La superficie de la esfera es " + calculo.superficie());
		System.out.println("El volumen de la esfera es " + calculo.volumen());
	}

}
