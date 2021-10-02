package terceira_aulajava;

import java.util.Scanner;

public class lista_de_exercicios2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float media1, media2, soma_medias, media_medias;
		
		Scanner leitor = new Scanner(System.in);
		
		media1 = (8 + 9 + 7) / 3;
		System.out.println("MEDIA ARITIMETICA DOS NUMEROS 8,9,7: " + media1);
		
		media2 = (4 + 5 + 6) / 3;
		System.out.println("MEDIA ARITIMETICA DOS NUMEROS 4,5,6: " + media2);
		
		soma_medias = (media1 + media2);
		System.out.println("A SOMA DAS MEDIAS É: " + soma_medias);
		
		media_medias = (media1 + media2)/2;
		System.out.println("A MEDIA DAS DUAS MEDIAS É: " + media_medias);
		
		
	}

}
