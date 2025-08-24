public class Aula03 {
    
    public static void main(String[] args) {
        // Declaração de variaveis
		int n1, n2, n3;
		String nome1, nome2;
		
		// Atribuição de valores a variaveis
		n1 = 2;
		n2 = 3;
		n3 = 8;
		
		nome1 = "Sofia";
		nome2 = "Alex";
		
		// Utilizando operadores relacionais para comparar String
		boolean valorLogico = nome1 != nome2;
		
		System.out.println(valorLogico + "\n");
		
		valorLogico = nome1 == nome2;
		
		System.out.println(valorLogico + "\n");
		
		// Operadores aritmeticos
		System.out.println("Operadores aritmeticos");
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + + (n1 - n2));
		System.out.println(n1 + " * " + n2 + " = " + + (n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " + + (n1 / n2) + "\n"); // Vai retornar um valor inteiro
		
		// Testando alguns typecast
		System.out.println("Testando alguns typecast int para float");
		float valor = n1 / n2;
		System.out.println(valor);
		
		valor = (float) n1 / n2;
		System.out.println(valor + "\n");
		
		System.out.println("Testando alguns typecast - float para int");
		valor = n1 % n2;
		System.out.println(valor);
		
		int v = (int) valor;
		System.out.println(v + "\n");
		
		// Operadores relacionais
		System.out.println("Operadores relacionais");
		System.out.println(n1 + " == " + n2 + " = " + (n1 == n2));
		System.out.println(n1 + " > " + n2 + " = " + (n1 > n2));
		System.out.println(n1 + " < " + n2 + " = " + (n1 < n2));
		System.out.println(n1 + " >= " + n2 + " = " + (n1 >= n2));
		System.out.println(n1 + " <= " + n2 + " = " + (n1 <= n2));
		System.out.println(n1 + " != " + n2 + " = " + (n1 != n2) + "\n");
		
		// Operadores logicos
		System.out.println("Operadores logicos");
		System.out.println(n1 + " <= " + n2 + " && " + n1 + " != " + n3 + " = " +(n1 <= n2 && n1 != n3));
		System.out.println(n1 + " == " + n2 + " || " + n1 + " != " + n3 + " = " +(n1 == n2 || n1 != n3));
		System.out.println("!(" + n1 + " <= " + n2 + " && " + n1 + " != " + n3 + ")" + " = " + !(n1 <= n2 && n1 != n3) + "\n");
		

		System.out.println(n1 == n2 || !(n1 != n3 && n2 >= n1));
		
		/* 				=  n1 == n2 ||	!(V && V)
		 *
		 * 				=	   F    ||      F
		 * 			    
		 * 				=		    F -> Valor lógico final
		 */
    }

}
