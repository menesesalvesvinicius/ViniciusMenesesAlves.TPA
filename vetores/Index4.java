import java.util.Scanner;

public class Index4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner l = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[], b[], i, m = 0, r;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for (i = 0; i<TAM; i++) {
			System.out.println("Digite o valor " +(i + 1)+ " Do vetor 1: ");
			a[i] = l.nextInt();
		}
		
		for (i = 0; i<TAM; i++) {
			m += a[i];
		}
		
		r = m / 10;
		
	    System.out.print("A média do vetor é: " + r);

	}

}
