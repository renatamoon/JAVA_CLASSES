package quarta_aulajava;

import java.util.*;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0, cont=0, soma=0; //CONT = calcula a quantidade de numeros lidos
		float media=0; //geralmente não é valor inteiro
		
		Scanner sc = new Scanner(System.in);
		
		while(num>=0) {
			System.out.println("DIGITE UM NUMERO ");
			num = sc.nextInt();
		
			soma = soma + num;
			cont++;
			media = soma/cont;
			System.out.println("MEDIA PARCIAL = "+ media);
			System.out.println("DIGITE O VLAOR NEGATIVO PARA SAIR = ");
			num = sc.nextInt();
		}
		System.out.println("MEDIA FINAL = "+ media);
		}	
}
