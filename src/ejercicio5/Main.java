package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Declramos variables
		int num;
		int exp;
		
		//Creamos el Scanner
		Scanner read= new Scanner (System.in);
		
		//Solicitamos al usuario un número
		System.out.println("Introduzca un número para sumarlo con todos los números anteriores a él: ");
		//Leemos el dato
		num=read.nextInt();
		//Solicitamos al usuario el número al que quiere elevar el anterior.
		System.out.println("Introduzca el número al que quiere elevar la base: ");
		//Leemos el dato
		exp=read.nextInt();
		//Se mostrará en pantalla los resultados según las operaciones llevadas a cabo en cada función.
		System.out.println(FuncionesRecursivas.sumatorio(num));
		System.out.println(FuncionesRecursivas.potencia(num, exp));
		System.out.println(FuncionesRecursivas.fibonacci(num));

		//Finalmente, cerramos el Scanner
		read.close();
	}

}
