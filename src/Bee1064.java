import java.util.Locale;
import java.util.Scanner;

public class Bee1064 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		int contador = 0;
		double media = 0.0;

		if (a > 0) {
			contador += 1;
			media += a;
		}
		if (b > 0) {
			contador += 1;
			media += b;
		}
		if (c > 0) {
			contador += 1;
			media += c;
		}
		if (d > 0) {
			contador += 1;
			media += d;
		}
		if (e > 0) {
			contador += 1;
			media += e;
		}
		if (f > 0) {
			contador += 1;
			media += f;
		}

		if (contador > 0) {
			System.out.println(contador + " valores positivos");
			double resultado = media / contador;
			System.out.printf("%.1f%n", resultado);
		}

		sc.close();
	}

}
