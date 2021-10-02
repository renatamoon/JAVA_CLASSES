package terceira_aulajava;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);
        int numero = 0;
        int contador_par = 0;
        int contador_impar = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º número");
            numero = leitor.nextInt();
            
            if(numero % 2 == 0)contador_par++;
            else contador_impar++;
                                    	
          }
        
        System.out.println("FORAM DIGITADOS " + contador_par + " NUMEROS PARES \n");
        System.out.println("FORAM DIGITADOS " + contador_impar + " NUMEROS IMPARES \n");
        
    }
}
