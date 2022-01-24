import java.util.Scanner;

public class Bee1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int contador = 0;

		if (a % 2 == 0) {
			contador += 1;
		}
		if (b % 2 == 0) {
			contador += 1;
		}
		if (c % 2 == 0) {
			contador += 1;
		}
		if (d % 2 == 0) {
			contador += 1;
		}
		if (e % 2 == 0) {
			contador += 1;
		}

		if (contador > 0) {
			System.out.println(contador + " valores pares");
		}

		sc.close();
	}

}
