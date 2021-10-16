
public class ParImpar {

	public static void main(String[] args) {

		int valores[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int par[] = new int[20];
		int impar[] = new int[20];
		
		for(int i = 0; i < 20; i++) {
			if(valores[i] % 2 == 0) {
				par[i] = valores[i];
			}
			else {
				impar[i] = valores[i];
			}
		}
		
		System.out.print("Números do vetor principal: ");
		for( int i = 0; i < 20; i++) {
			System.out.print(valores[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("Números do vetor par: ");
		for( int i = 0; i < 20; i++) {
			System.out.print(par[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("Números do vetor impar: ");
		for( int i = 0; i < 20; i++) {
			System.out.print(impar[i]+" ");
		}
	}
	

}
