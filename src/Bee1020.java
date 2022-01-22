import java.util.Scanner;

public class Bee1020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idadeEmDias, anos, meses, dias, resto;

		idadeEmDias = sc.nextInt();

		anos = idadeEmDias / 365;
		System.out.println(anos + " ano(s)");

		resto = idadeEmDias % 365;
		meses = resto / 30;
		System.out.println(meses + " mes(es)");

		dias = resto % 30;
		System.out.println(dias + " dia(s)");

		sc.close();
	}

}
