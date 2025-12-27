import java.util.Scanner;

public class Questao_Nr12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidade;
		String produto;
		double preco_ch = 1200;
		double preco_fg = 2000;
		
		System.out.println("Escolha o produto Chaleira ou Fogao!");
		produto = sc.nextLine();
		
		System.out.println("Especifique a quantidade do produto!");
		quantidade = sc.nextInt();
		
		
		// Podem usar .equalsIgnoreCase("") para ignorar se é maúsculo ou minúsculo
		if (produto.equals("Chaleira")) {
			if (quantidade == 1) {
				/* 
				 * Determinar o preço final da chaleira para uma unidade
				 * 
				 * preco_ch = preco_ch - (preco_ch * 0.3);
				 */
				preco_ch -=(preco_ch * 0.3);
				System.out.println("O preco final eh: " + preco_ch);
			} else if (quantidade > 1){
				// Determinar o preço final da chaleira de acordo com a quantidade informada
				preco_ch = preco_ch * quantidade - (preco_ch * 0.4);
				System.out.println("O preco final eh: " + preco_ch);
			}
		} else if (produto.equals("Fogao")) {
			if (quantidade == 1) {
				// Determinar o preço final do fogão para uma unidade
				preco_fg -=(preco_fg * 0.25);
				System.out.println("O preco final eh: " + preco_fg);
			} else if (quantidade > 1){
				// Determinar o preço final do fogão de acordo com a quantidade informada
				preco_fg = preco_fg * quantidade - (preco_fg * 0.35);
				System.out.println("O preco final eh: " + preco_fg);
			}
		}

	}

}