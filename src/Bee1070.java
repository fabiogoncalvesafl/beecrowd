import java.util.Scanner;

public class Bee1070 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x % 2 == 0) {
			x += 1;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
		} else {
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
		}

		sc.close();
	}

}
