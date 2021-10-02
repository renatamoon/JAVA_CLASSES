package terceira_aulajava;

import java.util.Scanner;

public class lista_de_exercicios {

	public static void main(String[] args) {		

		int anos, meses, dias;
		int idadeEmDias;		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("DIGITE A IDADE EM ANOS: ");		
		anos = leitor.nextInt();
		System.out.print("DIGITE A IDADE EM MESES: ");
		meses = leitor.nextInt();
		System.out.print("DIGITE A IDADE EM DIAS: ");
		dias = leitor.nextInt();
		
		idadeEmDias = anos * 365 + meses * 30 + dias;
		System.out.println("IDADE EM DIAS: " + idadeEmDias);
	
	
	}

}
