import java.util.Scanner;

public class Bee1013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d, e;
		d = (a + b + Math.abs(a - b)) / 2;
		e = (d + c + Math.abs(d - c)) / 2;
		
		System.out.printf("%d eh o maior%n", e);
		
		sc.close();
	}

}
