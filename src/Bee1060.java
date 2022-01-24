import java.util.Locale;
import java.util.Scanner;

public class Bee1060 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		int soma = 0;

		if (a > 0) {
			soma += 1;
		}
		if (b > 0) {
			soma += 1;
		}
		if (c > 0) {
			soma += 1;
		}
		if (d > 0) {
			soma += 1;
		}
		if (e > 0) {
			soma += 1;
		}
		if (f > 0) {
			soma += 1;
		}

		if (soma > 0) {
			System.out.println(soma + " valores positivos");
		}

		sc.close();
	}

}
