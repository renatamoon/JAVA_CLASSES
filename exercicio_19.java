package terceira_aulajava;

import java.util.Scanner;

public class exercicio_19 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
		
		int quantidade_Intervalo = 0;
		int quantidade_fora_intervalo = 0;
				
		
		System.out.println("INSIRA OS VALORES: ");
		
		for (int i = 0; i<10; i++) {
			int num = leitor.nextInt();
			
			if (num >= 10 && num <= 20)quantidade_Intervalo++;
			else quantidade_fora_intervalo++;
		}
		System.out.println("QUANTIDADE DE NUMEROS DENTRO DO INTERVALO:" + quantidade_Intervalo);
		System.out.println("QUANTIDADE DE NUMEROS FORA DO INTERVALO:" + quantidade_fora_intervalo);
	
		leitor.close();
	}

}
