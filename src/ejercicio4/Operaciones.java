package ejercicio4;

public class Operaciones {
	//Declaramos estas dos variables NO estáticas globales
	double a,b;
	//Creamos la siguiente función no estática llamada suma
	double suma () {
		//Nos devolverá la suma de las variables globales
		return a+b;
	}
	//Creamos la siguiente función no estática llamada resta
	double resta(){
		//Nos devolverá la resta de las variables globales
		return a-b;
	}
	//Creamos la siguiente función no estática llamada multiplicación
	double multiplicación() {
		//Nos devolverá la multiplicación de las variables globales
		return a*b;
	}
	//Creamos la siguiente función no estática llamada división
	double division () {
		//Declaramos la variable result y la inicializamos a 0
		double result=0;
		//Pondremos la condición de que b tiene que ser distinto de cero para que me haga la división
		if (b!=0) {
			result=a/b;
		}
		//Nos devolverá la división de las variables globales
		return result;	
	}
	
	
}
