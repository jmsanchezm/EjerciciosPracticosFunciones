package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		String resultPrimo;
		String resultCapicua;
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		num=read.nextInt();
		Numeros operaciones = new Numeros();
		resultPrimo= operaciones.esPrimo(num)?"Es primo": "No es primo";
		System.out.println(resultPrimo);
		resultCapicua=operaciones.esCapicua(num)?"Es capicúa": "No es capicúa";
		System.out.println(resultCapicua);
		
		
		
		

	}

}
