import java.util.Locale;
import java.util.Scanner;

public class Bee1010 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1 = sc.nextInt();
		int numPeca1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int codPeca2 = sc.nextInt();
		int numPeca2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double valorTotal = (numPeca1 * valor1) + (numPeca2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();
	}

}
