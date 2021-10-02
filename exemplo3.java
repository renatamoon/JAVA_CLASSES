package entrada_saida_io;

import java.util.*;

public class exemplo3 {
	public static void main(String[] args) {
		int n1, n2;
		String nome;
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE UM NUMERO INTEIRO: ");
		n1 = sc.nextInt();
		System.out.println("DIGITE UM OUTRO INTEIRO:");
		n2 = sc.nextInt();
		System.out.println("A SOMA É:" + (n1+n2));
		System.out.println("A SUBTRAÇÃO É:" + (n1-n2));
		System.out.println("A MULTIPLICAÇÃO É:" + (n1*n2));
		System.out.println("A DIVISÃO É:" + (n1/n2));
	}
}
