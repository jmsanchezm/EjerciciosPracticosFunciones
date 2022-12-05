package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Creamos el objeto
		Operaciones calc =new Operaciones();
		
		//Abrimos el Scanner
		Scanner read= new Scanner (System.in);
		
		//Solicitamos datos
		System.out.println("Introduzca dos números:");
		//Se leerán y se guardarán en las variables globales de la clase Operaciones
		calc.a=read.nextDouble();
		calc.b=read.nextDouble();
		
		//Mostramos por pantalla los resultados dados
		System.out.println("La suma es " + calc.suma());
		System.out.println("La resta es "+ calc.resta());
		System.out.println("La multiplicación es " + calc.multiplicación());
		System.out.println("La división es " + calc.division());
		
		//Finalmente cerramos el Scanner
		read.close();
	}

}
