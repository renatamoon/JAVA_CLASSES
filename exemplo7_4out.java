package quarta_aulajava;

import java.util.*;

public class exemplo7_4out {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int senha=1234, minha_senha;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite a senha");
			minha_senha = sc.nextInt();
			
		}while(minha_senha != senha);
		
		System.out.println("Senha esta correta");
	}

	}

