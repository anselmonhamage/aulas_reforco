import java.util.Scanner;

public class Desafio04 {
    
    public static void main(String[] args) {
        // Aula 03 - Desafio 04

        /**
         *  Escreva um programa para o calculo da média ponderada do
         *  estudante, sabendo que a nota 1 e 2 têm peso 35% e o trabalho prático
         *  tem peso de 30%.
         */

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota_trab, media;

        System.out.println("Informe a primeira nota: ");
        nota1 = sc.nextInt();

        System.out.println("Informe a segunda nota: ");
        nota2 = sc.nextInt();

        System.out.println("Informe a nota do trabalho: ");
        nota_trab = sc.nextInt();

        media = nota1 * 0.35 + nota2 * 0.35 + nota_trab * 0.30;

        System.out.println("A média ponderada entre " + nota1 + ", " + nota2 + " e " +  nota_trab + " é: " + media);

    }
}    