import java.util.Scanner;

public class Questao_Nr11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio, diametro, area;
		
		System.out.println("Informe o raio: ");
		raio = sc.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		diametro = 2 * raio;
		
		System.out.println("A área do círculo é: " + area);
		
		System.out.println("O diametro do círculo é: " + diametro);	

	}

}