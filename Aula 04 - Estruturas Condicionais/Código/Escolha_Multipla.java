import java.util.Scanner;

public class Escolha_Multipla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		// Declarções e inicialização das variáveis
		float saldo = 1000;
		float valor = 0;
		
		// Criação do menu do M-Pesa simples
		System.out.println("M-pesa\n"
				+ "1 - Transferencia\n"
				+ "2 - Levantamento");
		int opcao = sc.nextInt();
		
		switch (opcao) {
			case 1:
				// Lógica de transferência
				System.out.println("Transferencia");
				System.out.println("Digite o valor a transferir!");
				valor = sc.nextFloat();
				
				// Verifica se tem o saldo suficiente ou se valor a transferir não excede o saldo
				if (saldo <= 0 && valor > saldo) {
					System.out.println("Saldo insuficiente!");
				} else {
					System.out.println("Saldo disponivel " + saldo);
					saldo = saldo - valor;
					System.out.println("O seu saldo agora eh " + saldo);	
				}
				
				break;
			case 2:
				// Lógica de levantamento
				System.out.println("Levantamento");
				break;
			default:
				System.out.println("Erro, opcao invalida!");
		}

        sc.close();
    }
}
