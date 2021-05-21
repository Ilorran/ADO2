package ado2q1;
import java.util.Scanner;
public class ADO2_q3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o peso das 15 pessoas sendo 4 pessoas de 1 a 10 anos"
				+ "4 de 11 a 20 anos, 4 de 21 a 30 e 3 pessoas com mais de 30: ");
		int [] vetor = new int [15];
		int i;
		int j;
		int k;
		int l;
		for (i = 1; i <= 4;i++) {
			System.out.print("Peso de 1 a 10 anos: ");
	    	vetor[i] = teclado.nextInt();
	    	
	 }
		for (j = 1; j <= 4;j++) {
			System.out.print("Peso de 11 a 20 anos: ");
	    	vetor[j] = teclado.nextInt();
	    	
	 }
		for (k = 1; k <= 4;k++) {
			System.out.print("Peso de 21 a 30 anos: ");
	    	vetor[k] = teclado.nextInt();
	    	
	 }
		for (l = 1; l <= 3;l++) {
			System.out.print("Peso de mais de 30 anos: ");
	    	vetor[l] = teclado.nextInt();
	    	
	 }
		
		float peso1 = (i + i + i + i) / 4;
		float peso10 = (j + j + j + j) / 4;
		float peso21 = (k + k + k + k) / 4;
		float peso30 = (l + l + l) / 3;
		
		
		System.out.println("Média de peso de 1 a 10 anos: " + String.format("%.2f", peso1 * 10));
		System.out.println("Média de peso de 11 a 20 anos: " + String.format("%.2f", peso10 * 10));
		System.out.println("Média de peso de 21 a 30 anos: " + String.format("%.2f", peso21 * 10));
		System.out.println("Média de peso de mais de 30 anos: " + String.format("%.2f", peso30 * 10));
		
		

		
	}

}
