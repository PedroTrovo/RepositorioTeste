import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int vetor[] = new int[5];
		
		//int vetor2[] = {4, 3, 5, 3, 6};
		/*
		 * vetor[0] = teclado.next(); vetor[1] = teclado.next(); vetor[2] =
		 * teclado.next(); vetor[3] = teclado.next(); vetor[4] = teclado.next();
		 */

		// entrada de dados
		for(int i = 0; i < 5; i++) {
			vetor[i] = teclado.nextInt();
		}
		
		double media = 0;
		
		// saida de dados
		for(int i = 0; i < 5; i++) {
			System.out.println(i + " " + vetor[i]);
			
			media += vetor[i];
			
		}
			System.out.println("A média é: "+media/5);
	}

}
