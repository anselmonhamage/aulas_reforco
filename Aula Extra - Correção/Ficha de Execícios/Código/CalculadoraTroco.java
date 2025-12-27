import java.util.Scanner;

public class CalculadoraTroco {

    public static void main(String[] args) {
        // Entrada
        System.out.println("Digite o valor da compra: ");
        double compra = sc.nextDouble();

        System.out.println("Digite o valor pago: ");
        double pago = sc.nextDouble();

        double troco = pago - compra;
        System.out.println("Troco: ", troco);

        if (troco < 0) {
            System.out.println("Valor pago insuficiente!");
            return;
        }

        // Trabalhando em centavos
        int centavos = (int) Math.round(troco * 100);

        System.out.println("\nDecomposição do troco:");

        // NOTAS
        if (centavos >= 5000) {
            int qtd = centavos / 5000;
            System.out.println(qtd + " nota(s) de 50");
            centavos = centavos % 5000;
        }
        if (centavos >= 2000) {
            int qtd = centavos / 2000;
            System.out.println(qtd + " nota(s) de 20");
            centavos = centavos % 2000;
        }
        if (centavos >= 1000) {
            int qtd = centavos / 1000;
            System.out.println(qtd + " nota(s) de 10");
            centavos = centavos % 1000;
        }
        if (centavos >= 500) {
            int qtd = centavos / 500;
            System.out.println(qtd + " nota(s) de 5");
            centavos = centavos % 500;
        }
        if (centavos >= 200) {
            int qtd = centavos / 200;
            System.out.println(qtd + " nota(s) de 2");
            centavos = centavos % 200;
        }
        if (centavos >= 100) {
            int qtd = centavos / 100;
            System.out.println(qtd + " nota(s) de 1");
            centavos = centavos % 100;
        }

        // MOEDAS
        if (centavos >= 50) {
            int qtd = centavos / 50;
            System.out.println(qtd + " moeda(s) de 0.50");
            centavos = centavos % 50;
        }
        if (centavos >= 20) {
            int qtd = centavos / 20;
            System.out.println(qtd + " moeda(s) de 0.20");
            centavos = centavos % 20;
        }
        if (centavos >= 10) {
            int qtd = centavos / 10;
            System.out.println(qtd + " moeda(s) de 0.10");
            centavos = centavos % 10;
        }
        if (centavos >= 5) {
            int qtd = centavos / 5;
            System.out.println(qtd + " moeda(s) de 0.05");
            centavos = centavos % 5;
        }
        if (centavos >= 1) {
            int qtd = centavos / 1;
            System.out.println(qtd + " moeda(s) de 0.01");
            centavos = centavos % 1;
        }
    }
}