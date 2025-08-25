import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int num = entrada.nextInt();

        // Raíz quadrada usando método pow(Número, Expoente)
		double raizQuadrada = Math.pow(num, 0.5);
		System.out.println(raizQuadrada);
		
        // Raíz quadrada usando método sqrt(Raíz Quadrada)
		raizQuadrada = Math.sqrt(num);
		System.out.print(raizQuadrada);

        entrada.close();
    }

    
}
