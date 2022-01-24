import java.util.Scanner;

public class Bee1066 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;

		if (a % 2 == 0) {
			pares += 1;
		} else {
			impares += 1;
		}
		if (a > 0) {
			positivos += 1;
		} else if (a < 0) {
			negativos += 1;
		}
		if (b % 2 == 0) {
			pares += 1;
		} else {
			impares += 1;
		}
		if (b > 0) {
			positivos += 1;
		} else if (b < 0) {
			negativos += 1;
		}
		if (c % 2 == 0) {
			pares += 1;
		} else {
			impares += 1;
		}
		if (c > 0) {
			positivos += 1;
		} else if (c < 0) {
			negativos += 1;
		}
		if (d % 2 == 0) {
			pares += 1;
		} else {
			impares += 1;
		}
		if (d > 0) {
			positivos += 1;
		} else if (d < 0) {
			negativos += 1;
		}
		if (e % 2 == 0) {
			pares += 1;
		} else {
			impares += 1;
		}
		if (e > 0) {
			positivos += 1;
		} else if (e < 0) {
			negativos += 1;
		}

		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");

		sc.close();
	}

}
