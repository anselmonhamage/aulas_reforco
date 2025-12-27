import java.util.Scanner;

public class OperacoesCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebe um caractere
        System.out.print("Digite um caractere: ");
        char ch = sc.next().charAt(0); // Podemos ler o primeiro caractere da entrada dessa forma!

        // Verifica se é letra maiúscula ou minúscula
        if (Character.isLetter(ch)) {
            if (Character.isUpperCase(ch)) {
                System.out.println("É uma letra maiúscula.");
            } else {
                System.out.println("É uma letra minúscula.");
            }

            // Converte para maiúscula e minúscula
            System.out.println("Maiúscula: " + Character.toUpperCase(ch));
            System.out.println("Minúscula: " + Character.toLowerCase(ch));
        } else {
            System.out.println("Não é uma letra.");
        }

        // Exibe código ASCII
        int ascii = (int) ch;
        System.out.println("Código ASCII: " + ascii);

        // Próximo e anterior caractere na tabela ASCII
        System.out.println("Anterior: " + (char) (ascii - 1));
        System.out.println("Próximo: " + (char) (ascii + 1));
    }
}
