package quarta_aulajava;

import java.util.*;

public class exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int senha=123,password=0;
		Scanner sc = new Scanner(System.in);
		
		while(senha != password) { //comparação
			System.out.println("DIGITE A SENHA");
			password = sc.nextInt();
			
		}
		
		System.out.println("SENHA CORRETA");

	}

}
