package ado2q1;
import java.util.Scanner;
public class ADO2_q1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite: ");
		int desejo = teclado.nextInt();
		int fator = desejo;
		int i;
		int fatorial = 1;
		    for (i = 1; i <= desejo;i++) {
		    	
		    	fatorial = fatorial * i;
		    	System.out.print(desejo + ": " + fatorial);
		 }
		    System.out.print(" - o resultado é o último! ");
		  
	}
	
}
