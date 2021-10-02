package terceira_aulajava;

import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		float altura, peso; //pode guardar varias variaveis dentro da mesma classificação
				
		Scanner sc = new Scanner(System.in);
		//tem sempre que ter esse scanner "sc" para ele associar aos scanners embaixo
		//e ele é utilizado no IMPUT das informações.
		
		System.out.println("DIGITE SEU NOME: ");
		nome = sc.nextLine(); //variavel simples usa apenas o next, mas caso for uma variável
		//composta, como muitos nomes tem que usar nextLine
		//no Java tem sempre que usar nos numero a VIRGULA, POIS O PONTO NÃO É 
		//É USADO NO JAVA
		System.out.println("DIGITE SUA IDADE ");
		idade = sc.nextInt();
		System.out.println("DIGITE SUA ALTURA ");
		altura = sc.nextFloat();
		System.out.println("DIGITE SEU PESO ");
		peso = sc.nextFloat();
		
		System.out.println("O SEU NOME É: " + nome);
		System.out.println("A SUA IDADE É: " + idade);
		System.out.println("A SUA ALTURA É: " + altura);
		System.out.println("O SEU PESO É: " + peso);
		System.out.println("O SEU IMC É: " + (peso / (altura*2)));
	}
}
