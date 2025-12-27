import java.util.Scanner;

public class fatorial {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int fatorial = 1;

        System.out.println("digite um numero: ");
        int numero= e.nextInt();
        int inicio = numero;
        do{
            if(!(numero > 0)){
                System.out.println("Digite um numero positivo!");
                break;
            }

            fatorial = fatorial * inicio;
            inicio--;

        } while (inicio >= 1);
        System.out.println(fatorial);
    }
}