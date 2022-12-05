package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Declaramos variables
		int num;//Se guardará el número
		String resultPrimo;
		String resultCapicua;
		
		//Creamos el Scanner
		Scanner read= new Scanner (System.in);
		
		//Pedimos datos
		System.out.println("Introduzca un número: ");
		//Leemos dato
		num=read.nextInt();
		
		//Creamos el objeto cálculo
		Numeros cálculo = new Numeros();
		
		//Mostramos el resultado para ver si el número es primo.
		resultPrimo= cálculo.esPrimo(num)?"Es primo": "No es primo";
		System.out.println(resultPrimo);
		
		//Mostramos el resultado para ver si el número es capicúa.
		resultCapicua=cálculo.esCapicua(num)?"Es capicúa": "No es capicúa";
		System.out.println(resultCapicua);
		
		//Cerramos el Scanner
		read.close();
		
		
		
		

	}

}
