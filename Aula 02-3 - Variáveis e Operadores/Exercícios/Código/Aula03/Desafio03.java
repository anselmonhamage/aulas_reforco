import java.util.Scanner;

public class Desafio03 {
    
    public static void main(String[] args) {
        // Aula 03 - Desafio 03

        /**
         *   Escreva um programa que receba um valor em metros e o exiba convertido 
         *   em centímetros e milímetros.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor em metros(m): ");
        float metros = sc.nextFloat();

        float centimetros = metros * 100,
        milimetros = metros * 1000;

        System.out.println("O valor " + metros + "(m) é equivalente: " + centimetros + "(cm) e " + milimetros + "(mm)");

    }
}    