
public class ZinsDemo {
	public static void main(String[] args) {
		int kontostand = 3000;
		double zinsen = 1.5;
		int laufzeitmonate = 24;
		double zinsgeld = 0;
		
		zinsgeld = ((kontostand*zinsen*laufzeitmonate)/(100*12));
		
		System.out.println("Zinsen= "+zinsen+"% von "+kontostand+"€ = "+zinsgeld+"€");
	}

}
