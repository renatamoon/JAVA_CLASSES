package entrada_saida_io;

import java.util.*;

public class exemplo1 {
	public static void main(String[] args) {
		//declaração de variáveis
		int n1;
		String nome;
		//crio o scanner para ler do teclado
		Scanner sc = new Scanner(System.in);
		//processamento de dados
		System.out.println("DIGITE UM NUMERO INTEIRO");
		n1 = sc.nextInt();
		System.out.println("DIGITE SEU NOME");
		nome = sc.next();
		System.out.println("O nome é =" + nome);
	}
}
