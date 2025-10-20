import java.util.Scanner;

public class Index2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner l = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[], b[], c[], i;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		for (i = 0; i<TAM; i++) {
			System.out.println("Digite o valor " +(i + 1)+ " Do vetor 1: ");
			a[i] = l.nextInt();
		}
		
		for (i = 0; i<TAM; i++) {
			System.out.println("Digite o valor " +(i + 1)+ " Do vetor 2: ");
			b[i] = l.nextInt();
		}
		
		for (i = 0; i<TAM; i++) {
			c[i] = a[i] + b[i];
		}
		
	    System.out.print("O vetor resultante 31 é igual a: [");
	    
	    for (i = 0; i<TAM; i++) {
	    	System.out.print(c[i] + " ");
	    }
	    System.out.print("]");

	}

}
