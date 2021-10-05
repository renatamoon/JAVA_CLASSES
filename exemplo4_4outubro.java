package quarta_aulajava;

import java.util.*;

public class exemplo4_4outubro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i; // contador inicia em 1
		float nota=0, media=0, soma=0; //inicializando com 0
		
		for(i=1;i<=10;i++) { //i inicia em 1; laço for até 10; adiciona os valores em i
			
			System.out.println("DIGITE A NOTA DO ALUNO" + i);
			nota = sc.nextFloat();
			
			soma = soma + nota; //a soma recebe a primeira nota e guarda a nota com soma

	}
	
	media = soma/i;
	System.out.println("A MEDIA FINAL É: " + media);

	}
}
