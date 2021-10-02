package terceira_aulajava;

import java.util.*;

public class sexta_aula_exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] p = new int[10] ;
		Scanner sc = new Scanner(System.in);
		int i,j;
    // bloco de leitura		
	for(i=0;i<10;i++) {	
		System.out.println("Digite numero "+ i);
		p[i] = sc.nextInt();
	}
	// Bloco de impressão
	System.out.println("Impriminado do inico para o fim ");
	for(i=0;i<10;i++) {	
		System.out.println("numero = " + p[i]);
	}
	System.out.println("Impriminado do fim para o inicio ");
	for(i=0;i>=0;i--) {	
		System.out.println("numero = " + p[i]);
	}

	}

}
