import java.util.Scanner;

public class Questao_Nr13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, maior;

		System.out.println("Informe o primeiro valor: ");
		n1 = sc.nextInt();

		System.out.println("Informe o segundo valor: ");
		n2 = sc.nextInt();

		System.out.println("Informe o terceiro valor: ");
		n3 = sc.nextInt();

		maior = n1;

		if (n2 > maior) {
			maior = n2;
		}
		if (n3 > maior) {
			maior = n3;
		}

		System.out.println("Maior = " + maior);
	}
}