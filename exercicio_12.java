package terceira_aulajava;

import java.util.Scanner;

public class exercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sexo;
		double altura;
		double peso_ideal;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("INFORME O SEXO (1)FEMININO (2)MASCULINO ");
		sexo = leitor.nextInt();
		
		System.out.println("INFORME SUA ALTURA EM METROS (usando virgula):" );
		altura= leitor.nextDouble();
		
		if(sexo == 1) {
		
			peso_ideal = (62.1 * altura) - 44.7;
			System.out.printf("PESO IDEAL É = %.2f", peso_ideal);
		}else {
		
			peso_ideal = (72.7 * altura) - 58;
			System.out.printf("SEU PESO IDEAL É = %.2f", peso_ideal);

	}
		
	}

}
