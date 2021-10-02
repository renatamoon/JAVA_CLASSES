package terceira_aulajava;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		
		double salario_do_usuario;
		double quant_sm;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("QUAL O SEU SALARIO? R$ ");
		salario_do_usuario = leitor.nextDouble();
		
		quant_sm =  (salario_do_usuario / 788.00);
		System.out.printf("QUANTIDADE DE SALARIO(S) MINIMO(S) :%.2f ", quant_sm);
	}

}
