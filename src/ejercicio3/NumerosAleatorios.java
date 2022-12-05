package ejercicio3;

public class NumerosAleatorios {
	/*Creamos la primera función con el parametro de entrada num.
	Mostrará tantos números alatorios como la cantidad que haya introducido el user.*/
	static void numAleat1 (int num) {
		//Declaramos la variable result
		double result=0;
		//Usamos un for, hasta que llegue a num
		for(int i = 1; i<=num;i++) {
			//Irá generando números y mostrandolos en pantalla
			result=Math.random();
			System.out.println(result);
		}	
	} 
	/*Creamos la segunda función numAleat2 con dos parametros de entrada: num y max.
	 * Hará lo mismo que la función primera, pero está tendrá que llegar a un valor máximo*/
	static void numAleat2(int num, int max) {
		double result=0;
		for(int i=1;i<=num;i++) {
			//En este caso se multiplicará por el max 
			result=Math.random()*max;
			System.out.println((int)result);
		}
	}
	/*Creamos la tercera función numAleat3 con tres parametros de entrada: num, max y min.
	 * Hará lo mismo que las funciones anteriores, pero está tendrá que partir de min y  llegar a un valor máximo*/
	static void numAleat3(int num, int max, int min) {
		double result =0;
		for (int i =1; i<=num;i++) {
			//En este caso se llevará a cabo este procedimiento.
			result=Math.random()*((max+1)-min)+min;
			System.out.println((int)result);
		}
	}
}
