package ejercicio5;

public class FuncionesRecursivas {
	/*Creamos la función estática sumatorio, con el parametro de entrada num
	 * Esta función sumará todos los números anteriores
	 */
	static int sumatorio (int num) {
		int result;
		//Si num es menor o igual a 1
		if (num<=1) {
			//result será igual a 1
			result=1;
		
		//De lo contrario
		}else {
			//Se calculará el sumatorio de los numeros anteriores a num y este.
			result=num+sumatorio(num-1);
		}
		//Como resultado, devolverá el valor result
		return result;
		}
	
	/*Creamos la función potencia con los parámetros de entrada exponente y base
	 * Esta función calculará la potencia de un número.
	 */
	static int potencia (int exponente, int base) {
		int result=0;
		//Si exponente es igual a 0, result será 1
		if (exponente==0) {
			result=1;
		}
		//Si el exponente es igual a 1, result será el valor de la base.
		if (exponente==1) {
			result=base;
		//En caso contrario
		}else {
			//Calculará el valor
			for(int i= 1;i<=exponente;i++) {
				result=base*potencia (base,result);
			}
		}
		//Como resultado, devolverá el valor result
		return result;
	}
	
	//Creamos la función estática fibonacci con el parámetro de entrada serie
	static int fibonacci(int serie){
		//Declaramos la variable result
		int result;
		//Si serie es menor o igual a 1, result será igual a uno
		if(serie<=1) {
			result=1;
		//De lo contrario
		}else {
			//Calculará fibonacci
			 result=fibonacci(serie-1) + fibonacci(serie-2);
		}
		//Como resultado, se devolverá el valor de result.
		return result;
	}
	
	}

