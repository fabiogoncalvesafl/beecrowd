import java.util.Locale;
import java.util.Scanner;

public class Bee1002 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = 3.14159;
		double raio = sc.nextDouble();
		double area = n * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}

