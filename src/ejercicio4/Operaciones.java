package ejercicio4;

public class Operaciones {
	double a,b;
	double suma () {
		return a+b;
	}
	double resta(){
		return a-b;
	}
	double multiplicación() {
		return a*b;
	}
	double division () {
		double result=0;
		if (b!=0) {
			result=a/b;
		}
		return result;	
	}
	
	
}
