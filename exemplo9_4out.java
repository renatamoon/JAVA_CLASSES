package quarta_aulajava;

import java.util.*;

public class exemplo9_4out {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op, idade;
		float peso;
		Scanner sc = new Scanner(System.in);
		
	while(true) {	
		System.out.println("1-mostra idade");
		System.out.println("2-mostra peso");
		System.out.println("3-Sair");
		op = sc.nextInt();
		
		switch(op) {
		
		    case  1:  System.out.println("Digite sua idade");
		              idade = sc.nextInt();
		              System.out.println("idade = " + idade);
		              break;
		              
		    case  2:  System.out.println("Digite seu peso");
            		  peso = sc.nextFloat();
            		  System.out.println("peso = " + peso);
            		  break;
            		  
		    case  3:
		    	      System.exit(0);
		    	      
		    default:  System.out.println("opcao nao existe");
		    	     
		
		}
		
	}	


	}

}
