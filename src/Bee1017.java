import java.util.Locale;
import java.util.Scanner;

public class Bee1017 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horas = sc.nextInt();
		int velMedia = sc.nextInt();
		
		double qtdLitros = (horas * velMedia) / 12.0;
		
		System.out.printf("%.3f%n", qtdLitros);
		
		sc.close();
	}

}
