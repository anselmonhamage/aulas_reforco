import java.util.Scanner;

public class Desafio02 {
    
    public static void main(String[] args) {
        // Aula 03 - Desafio 02

        /**
         *  Desenvolva um programa que receba duas notas de um aluno, calcule e 
         *  mostre a sua media aritmética.
         */

        Scanner sc = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("Informe a primeira nota: ");
        nota1 = sc.nextInt();

        System.out.println("Informe a segunda nota: ");
        nota2 = sc.nextInt();

        media = (nota1 + nota2)/2;

        System.out.println("A média aritmética entre " + nota1 + " e " + nota2 + " é: " + media);

    }
}    