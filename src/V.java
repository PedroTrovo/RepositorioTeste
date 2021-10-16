
public class V {

	public static void main(String[] args) {
		int valores[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		        int par[] = new int[20];
		        int impar[] = new int[20];

		        int contPar = 0;
		        int contImpar = 0;

		        for(int i = 0;i < 20;i++) {
		            if(valores[i] % 2 == 0) {
		                par[contPar] = valores[i];
		                contPar++;
		            } else {
		                impar[contImpar] = valores[i];
		                contImpar++;
		            }
		        }

		        System.out.print("Vetor principal: ");
		        for(int i = 0;i < 20;i++) {
		            System.out.print(valores[i]+" ");
		        }

		        System.out.println();

		        System.out.print("Vetor par: ");
		        for(int i = 0;i < 10;i++) {
		            System.out.print(par[i]+" ");
		        }

		        System.out.println();

		        System.out.print("Vetor impar: ");
		        for(int i = 0;i < 10;i++) {
		            System.out.print(impar[i]+" ");
		        }

	}

}
