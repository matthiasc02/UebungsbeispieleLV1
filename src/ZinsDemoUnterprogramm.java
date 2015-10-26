
public class ZinsDemoUnterprogramm {
	public static void main(String[] args) {
		int kontostand = 3000;
		double zinsen = 1.5;
		int laufzeitmonate = 24;
		double zinsgeld = 0;
		
		System.out.println("Zinsen= "+zinsen+"% von "+kontostand+"€ = "+zinsgeld+"€");
	}
	public static void berechnung(){
		zinsgeld = ((kontostand*zinsen*laufzeitmonate)/(100*12));
	}
}
