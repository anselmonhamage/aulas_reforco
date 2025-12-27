import java.util.Scanner;

public class Herson_Easy_Doc {
    public static void main(String[] args) {

        System.out.println("Easy Doc");
        System.out.println("1 - Tratar BI");
        System.out.println("2 - Tratar carta de condução");
        System.out.println("3 - Sair");

        Scanner teclado = new Scanner(System.in);

        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Esta na secção de BI");
                break;
            case 2:
                System.out.println("Esta na secção de carta de condução");
                break;
            case 3:
                break;
            default:
                System.out.println("ERRO: Opção inválida!");
        }
    }
}