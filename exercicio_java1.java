package quarta_aulajava;

import java.util.Scanner;

public class exercicio_java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int senha=123,password=0;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("DIGITE A SENHA");
			password = sc.nextInt();
		}while(senha != password);
				
		System.out.println("SENHA CORRETA");

	}

}
