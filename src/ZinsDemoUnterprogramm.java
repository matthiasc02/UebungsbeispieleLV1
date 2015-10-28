
public class ZinsDemoUnterprogramm {
	private static int kontostand = 3000;
	private static double zinsen = 1.5;
	private static int laufzeitmonate = 24;
	private static double zinsgeld = 0;
	
	public static void berechnung(){
		zinsgeld = ((kontostand*zinsen*laufzeitmonate)/(100*12));
		System.out.println("Zinsen= "+zinsen+"% von "+kontostand+"€ = "+zinsgeld+"€");
	}
	
	public static void main(String[] args) {
		berechnung();
	}
}