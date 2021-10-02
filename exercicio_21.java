package terceira_aulajava;

import java.util.Scanner;

public class exercicio_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		int quant_habitantes = 0;
		double soma_salarios = 0;
		int mulheres = 0;
		int menor_salario_poridade = 0;
		int menor_idade = 10000;
		int maior_idade = 0;
		double menor_salario = 10000000;
		String menor_salario_porsexo = "";		
		
		while (true) {
			System.out.print("Insira a idade: ");
			int idade = leitor.nextInt();
			leitor.nextLine();
			
			if (idade < 0) break;
			
			quant_habitantes++;
			
			System.out.print("QUAL O SEXO (M)MASCULINO (F)FEMINIMNO: ");
			String sexo = leitor.nextLine();
			
			if (sexo.toUpperCase().equals("F")) mulheres++;
			
			if (sexo.toUpperCase().equals("M")) sexo = "MASCULINO";
			if (sexo.toUpperCase().equals("F")) sexo = "FEMININO";
						
			System.out.print("INFORME O SALARIO: ");
			double salario = leitor.nextDouble();
			
			System.out.println("");
			
			soma_salarios += salario;
			
			if (idade < menor_idade) menor_idade = idade;
			if (idade > maior_idade) maior_idade = idade;
			
			if (salario < menor_salario) {
				menor_salario = salario;
				menor_salario_poridade = idade;
				menor_salario_porsexo = sexo;
			}
		}
		
		System.out.println("");
		System.out.printf("A MEDIA DOS SALARIOS: R$ %.2f\n", (soma_salarios / quant_habitantes));
		System.out.println("MAIOR IDADE DO GRUPO É: " + maior_idade + " anos");
		System.out.println("MENOR IDADE DO GRUPO É: " + menor_idade + " anos");
		System.out.println("QUANTIDADE DE MULHERES NA REGIÃO: " + mulheres);
		System.out.printf("A PESSOA COM MENOR SALARIO TEM %d ANOS, DO SEXO %s\n", menor_salario_poridade, menor_salario_porsexo);
		
		leitor.close();

	}

}
