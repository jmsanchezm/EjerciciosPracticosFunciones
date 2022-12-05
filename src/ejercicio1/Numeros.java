package ejercicio1;

public class Numeros {
	/*Creamos la función tipo boolean esPrimo, con el parámetro de entrada numero.
	 * Esta función nos determinará si es un número es primo o no.*/
		boolean esPrimo (int numero) {
	 	//Declaramos la variable primo y la inicializamos a true
	 	boolean primo=true;
	 	//Se guardará el resultado
		String result;
		//Si el número=1
		if (numero ==1) {
			//primo tomará el valor false
			primo=false;
		}
		//Abrimos un for, inicializando j=2, que vaya desde j hasta el número, incrementándo por cada iteración 1.
		for (int j = 2; j<numero;j++) {
			//Si el módulo da de resultado cero, 
			if (numero%j==0) {
				primo=false;
			}
			}
		//Como resultado devolvemos el valor de primo
		return primo;	
}
	
 	/*Creamos la función esCapicua, con el parametro de entrada num.
 	 * Esta función nos determinará si un número es capicua.*/
		boolean esCapicua (int numero) {
		//Declaramos variables
		boolean result=true; //Inicializamos la variable result a true;
		int aux=numero;//Inicializamos el valor de aux a numero.
		int inv=0;//Inicializamos la variable inv a 0.
		int cifra;
		
		//Mientras que aux sea diferente
		while(aux!=0) {
			//Se calculará el módulo de aux
			cifra=aux%10;
			//Luego, multiplicaremos inv por 10 y le sumamos cifra
			inv=inv*10+cifra;
			//Dividimos aux entre 10.
			aux=aux/10;
		}
			//Si numero es igual al inverso, result= true
			if(numero==inv)
				result= true;
			//De lo contrario, false.
			else
				result=false;
		//Como resultado, devolvemos el valor de result.
		return result;
	}
}
