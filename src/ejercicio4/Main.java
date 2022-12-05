package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Operaciones calc =new Operaciones();
		Scanner read= new Scanner (System.in);
		System.out.println("Introduzca dos números:");
		calc.a=read.nextDouble();
		calc.b=read.nextDouble();
		read.close();
		System.out.println("La suma es " + calc.suma());
		System.out.println("La resta es "+ calc.resta());
		System.out.println("La multiplicación es " + calc.multiplicación());
		System.out.println("La división es " + calc.division());
	}

}
