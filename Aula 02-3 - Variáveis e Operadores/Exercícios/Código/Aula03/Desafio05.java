public class Desafio05 {
    
    public static void main(String[] args) {
        // Aula 03 - Desafio 05

        /**
         *   Desvende qual será o valor lógico final e logo de seguida crie um 
         *   programa para a seguinte expressão: !(n1 <= n2 || !(n1 != n3 && n1 < n2 || n1 >= n3))
         *   Sabendo que: n1 = 7, n2 = 3 e n3 = 7
         */

        int n1 = 7, n2 = 3, n3 = 7;

        System.out.println("O valor final da expressão: !(" + n1 + " <= " + n2 + " || !(" + n1 + " != " + n3 + " && " + n1 + " < " + n2 + " || " + n1 + " >= " + n3 + ")) é: " + !(n1 <= n2 || !(n1 != n3 && n1 < n2 || n1 >= n3)));

    }
}    