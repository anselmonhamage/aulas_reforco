import java.util.Scanner;

public class Desafio01 {
    
    public static void main(String[] args) {
        // Aula 03 - Desafio 01

        /**
         *  Crie um programa que receba um número e mostre o seu dobro, triplo e raiz 
         *  quadrada.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = sc.nextInt();

        System.out.println("Para o número " + num + ":\n" 
                         + "Seu dobro é: " + 2 * num + "\n"
                         + "Seu triplo é: " + 3 * num + "\n"
                         + "A raiz quadrada é: " + Math.sqrt(num) + "\n" // pode ser feito assim: Math.pow(num, 0.5) que representa num^(1/2)
        );

    }
}    