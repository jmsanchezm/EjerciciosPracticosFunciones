package ejercicio1;

public class Numeros {
	//Creamos la función tipo boolean esPrimo, con el parámetro de entrada numero
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
		
		return (primo);	
}
 	//Creamos la función esCapicua, con el parametro de entrada num
	boolean esCapicua (int numero) {
		//Declaramos variables
		boolean result=true;
		int aux;
		int inverso=0;
		int cifra;
		aux=numero;
		//Mientras que aux sea diferente
		while(aux!=0) {
			cifra=aux%10;
			inverso=inverso*10+cifra;
			aux=aux/10;
		}
			if(numero==inverso)
				result= true;
			else
				result=false;
		
		return result;
	}
}
