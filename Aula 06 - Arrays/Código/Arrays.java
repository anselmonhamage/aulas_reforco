package arrays;

import java.util.Scanner;

public class arrays {

   public static void main(String[] args) {
        /*
        * Crie um programa que permite cadastrar até 6 nomes
        * em um array. Tambem deve fazer
        * as seguintes tarefas:
        * 1 - exibir o nome da posição 3
        * 2 - Substituir o nome da posição 5 por outro qualquer
        * 3 - Exibir todos os nomes cadastrados
        * */
       Scanner sc = new Scanner(System.in);

       String[] nomes = new String[6];

       for (int i = 0; i <= nomes.length - 1; i++) {
           System.out.println("Digite o nome: ");
           nomes[i] = sc.nextLine();
       }

       System.out.println("nome da posição[3]: " + nomes[3]);
       System.out.println("Substituição do nome[5]:" + nomes[5]);

       for (int i = 0; i <= nomes.length - 1; i++){
           System.out.println(nomes[i]);
       }

   }
}