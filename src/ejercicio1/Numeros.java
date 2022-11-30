package ejercicio1;

public class Numeros {
 boolean esPrimo (int numero) {
		boolean primo=true;
		String result;
		if (numero ==1) {
			primo=false;
		}
		for (int j = 2; j<numero;j++) {
			if (numero%j==0) {
				primo=false;
			}
			}
		
		return (primo);	
}

	boolean esCapicua (int numero) {
		boolean result=true;
		int aux;
		int inverso=0;
		int cifra;
		aux=numero;
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
