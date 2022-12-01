package ejercicio2;

public class Esfera {
	static double radio;
	double superficie() {
		double result;
		result= 4*Math.PI*(radio*radio);
		return result;
	}
	double volumen () {
		double result;
		result=((4*Math.PI)/3)*Math.pow(radio, 3);
		return result;
	}
}
	
