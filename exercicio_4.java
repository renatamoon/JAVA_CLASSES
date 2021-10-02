package terceira_aulajava;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			   		
		      Scanner leitor = new Scanner(System.in);
		      int tamanho_quadrado;
		      
		      System.out.print("DIGITE UM NUMERO EQUIVALENTE AO LADO DO QUADRADO: ");
		      tamanho_quadrado = leitor.nextInt(); 
		      
		      for(int x = tamanho_quadrado; x > 0; x--){ 
		            for(int y = tamanho_quadrado; y > 0; y--){
		              System.out.print("*");
		            }
		       System.out.println();  
		       }
		      
		   }
		   
		}

