package quarta_aulajava;

import java.util.*;

public class exemplo8_4out {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			float media;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Qual sua media");
			media = sc.nextFloat();
			
			if(media < 4.0) { 
				System.out.println("reprovado"); 
			}
			else if(media < 6.0) {
				System.out.println("recuperação"); 
			}
			else {
				System.out.println("aprovado");

	}

	}
}
