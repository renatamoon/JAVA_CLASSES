package terceira_aulajava;

import java.util.Scanner;

public class exercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int quantidade_macas;
		double total_compra1;
		double total_compra2;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("QUANTAS MAÇÃS FORAM COMPRADAS? ");
		quantidade_macas = leitor.nextInt();
		
		if (quantidade_macas < 12) {
			total_compra1 = (quantidade_macas * 0.30);
			System.out.printf("O VALOR DA COMPRA SERÁ = R$ %.2f ", total_compra1);			
		}else {
			total_compra2 = (quantidade_macas * 0.25);
			System.out.printf("O VALOR DA COMPRA SERÁ = R$ %.2f ", total_compra2);		
		

	}

}
}