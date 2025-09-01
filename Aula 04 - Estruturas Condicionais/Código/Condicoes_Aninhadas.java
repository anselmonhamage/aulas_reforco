public class Condicoes_Aninhadas {
    public static void main(String[] args) {
        String nome = "Anselmo";
		
		if (nome.equals("Diana")) {
			System.out.println("O fluxo desviou");
		} else {
			if (nome.isEmpty()) {
				System.out.println(nome.toUpperCase());
			} else {
				System.out.println(nome.toLowerCase());
			}
		}
		
		System.out.println("Fluxo normal");
    }
}
