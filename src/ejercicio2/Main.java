package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Creamos el Scanner
		Scanner read= new Scanner (System.in);
		
		//Solicitamos al usuario el radio de la esfera
		System.out.println("Introduzca el radio de la esfera");
		//Leemos dato.Este dato se guardará en la clase esfera.
		Esfera.radio=read.nextDouble();
		
		//Creamos el objeto calculo, para el uso de funciones no estáticas.
		Esfera calculo= new Esfera ();
		
		//Se le mostrará los resultados en pantalla al usuario.
		System.out.println("La superficie de la esfera es " + calculo.superficie());
		System.out.println("El volumen de la esfera es " + calculo.volumen());
		
		//Finalmente, cerramos el Scanner 
		read.close();
	}

}
