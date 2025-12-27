public class Desafio02 {
    
    public static void main(String[] args) {
        // Aula 02 - Desafio 02

        /**
         *  Crie um programa java que receba o dia, o mês e ano de nascimento de 
         *  uma pessoa e mostre uma mensagem com o nome, altura(1.67m) e 
         *  com a data formatada(ano-mês-dia. Ex.: 2000-08-20)
         */
		
		String nome = "Anselmo Nhamage";
		int dia = 1, mes = 4, ano = 2004;
        float altura = 1.67f;

        System.out.println("O nome é: " + nome + "\n"
                         + "A altura é: " + altura + "\n"
                         + "Data de nascimento: " + ano + "-" + mes + "-" + dia
        );
    }

}
