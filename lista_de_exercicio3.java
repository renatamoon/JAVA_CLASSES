package terceira_aulajava;

import java.util.Scanner;

public class lista_de_exercicio3 {

	public static void main(String[] args) {
	

		float saldo_atual;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("DIGITE O SALDO ATUAL: ");		
		saldo_atual = leitor.nextFloat();
		
		System.out.println("O SALDO REAJUSTADO É DE: " + (saldo_atual * 1.01));
	}

}
