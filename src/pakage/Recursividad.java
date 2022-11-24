package pakage;

public class Recursividad {

	public static void main(String[] args) {

		double base = 1;
		int exponente = 10000;
		
		System.out.println("El resultado en versión iterativa es: " + potenciaIter(base, exponente));
		
		System.out.println("El resultado en versión recursiva es: " + potenciaRec(base, exponente));
	}
	
static double potenciaIter(double base, int exponente) {
	double r = base;
	for (int i = 1; i<exponente; i++) {
		r = base * r;
	}
	return r;
}
static double potenciaRec(double base, int exponente) {
	double r;
	if(exponente == 1) {
		r = base;
	} else {
		r = base * potenciaRec(base, exponente - 1);
	}
	return r;
}
}