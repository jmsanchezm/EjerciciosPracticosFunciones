package ejercicio3;

public class NumerosAleatorios {
	static void numAleat1 (int num) {
		double result=0;
		for(int i = 1; i<=num;i++) {
			result=Math.random();
			System.out.println(result);
		}	
	} 
	
	static void numAleat2(int num, int max) {
		double result=0;
		for(int i=1;i<=num;i++) {
			result=Math.random()*max;
			System.out.println((int)result);
		}
	}
	
	static void numAleat3(int num, int max, int min) {
		double result =0;
		for (int i =1; i<=num;i++) {
			result=Math.random()*((max+1)-min)+min;
			System.out.println((int)result);
		}
	}
}
