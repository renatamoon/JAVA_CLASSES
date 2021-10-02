package terceira_aulajava;
import java.util.*;
public class sexta_aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float[] p = new float[5] ;
		Scanner leitor = new Scanner(System.in);
		int i;
		
		
    // bloco de leitura		
	for(i=0;i<5;i++) {	
		System.out.println("Digite sua nota");
		p[i] = leitor.nextFloat();
	}
	// Bloco de impressão
	for(i=0;i<5;i++) {	
		System.out.println("nota = " + p[i]);
	}		
		
		

	}

}
