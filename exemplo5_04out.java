package quarta_aulajava;

import java.util.*;

public class exemplo5_04out {

	public static void main(String[] args) {
				
		//programa que vai pedir a senha até que seja a senha correta
		
		int senha=1234; //guarda a senha de acesso
		int minha_senha=0;
		int cont=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGTE A SENHA: ");
		minha_senha = sc.nextInt();
		
		while(minha_senha != senha && cont <2) {
			System.out.println("DIGITE A SENHA: ");
			minha_senha = sc.nextInt();
			cont++;
		}
		
		if (minha_senha == senha)
			System.out.println("SENHA CORRETA!!");
			else
				System.out.println("SENHA DIGITADA INCORRETA 3 VEZES :( ");

	}

}
