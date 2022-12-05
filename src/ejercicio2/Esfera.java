package ejercicio2;

public class Esfera {
	/*Declaramos la variable estática global radio.
	 * Aquí se guardará el dato dado por el usuario*/
	static double radio;
	
	//Creamos la función no estática superficie, sin ningún parámetro de entrada.
	double superficie() {
		//Declaramos la variable result
		double result;
		//Utilizamos la fórmula del cálculo de la superficie de la esfera.
		result= 4*Math.PI*(radio*radio);
		//Esta función nos devolverá el valor de result
		return result;
	}
	//Creamos la función no estática volumen, sin admisión de parámetros de entrada.
	double volumen () {
		//Declaramos la variable result, en la que se almacenará el resultado del cálculo del volumen.
		double result;
		//Calculamos el volumen.
		result=((4*Math.PI)/3)*Math.pow(radio, 3);
		//Como resultado, devolveremos el valor result
		return result;
	}
}
	
