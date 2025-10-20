import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner l = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[], b[], i;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for (i = 0; i<TAM; i++) {
			System.out.println("Digite o valor " +(i + 1)+ " Do vetor 1: ");
			a[i] = l.nextInt();
		}
		
		for (i = 0; i<TAM; i++) {
			b[i] = a[i] * a[i];
		}
		
	    System.out.print("O vetor resultante 2 é igual a: [");
	    
	    for (i = 0; i<TAM; i++) {
	    	System.out.print(b[i] + " ");
	    }
	    System.out.print("]");

	}

}
