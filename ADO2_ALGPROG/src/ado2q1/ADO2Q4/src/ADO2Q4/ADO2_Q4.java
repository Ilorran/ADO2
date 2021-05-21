package ADO2Q4;
import java.util.Scanner;
public class ADO2_Q4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int pessoas = 0;
		int sexo;
		int sexoM = 0;
		int sexoF = 0;
		int sxfinalF = 0;
		int sxfinalM = 0;
				
		while(pessoas < 10) {
		
			 System.out.print("Sexo primeira pessoa (feminino = 1, masculino = 2): ");
			 sexo = teclado.nextInt();
			 sexoF = sexo;
			 sexoM = sexo;
			 
			 if (sexoF == 1) {
				 sxfinalF++;
				 pessoas++;
			 }
			 
			 if (sexoM == 2) {
				 sxfinalM++;
				 pessoas++;
			 }
			 
			 else if (sexo >= 3) {
				 System.out.println("Opção invalida= " + " '" +   sexo + "' ");
			 }
			 
			 System.out.println("Mulheres= " + sxfinalF + " Homens= " + sxfinalM);
		
			 
		}
		int habilita = 0;
		int carta;
		int cartaF = 0;
		int cartaM = 0;
		int cartafinalF = 0;
		int cartafinalM = 0;
		
		while(habilita < pessoas) {
			
			 System.out.print("Habilitação com mais de 3 anos (mulheres digite = 1, homens digite = 1): ");
			 carta = teclado.nextInt();
			 cartaF = carta;
			 cartaM = carta;
			 
			 if (cartaF == 1 && habilita <= pessoas) {
				 cartafinalF++;
				 habilita++;
			 }
			 
			 if (cartaM == 2 && habilita <= pessoas) {
				 cartafinalM++;
				 habilita++;
			 }
			 
			 else if (carta >= 3) {
				 System.out.println("Opção invalida= " + " '" +   carta + "' ");
			 }
			 
			 System.out.println("Mulheres= " + cartafinalF + " Homens= " + cartafinalM);
		
			}
		
		int idadequantidade = 0;
		int idadeF = 0;
		
		while(idadequantidade < cartafinalF) {
			System.out.println("Digite a idade das mulheres: ");
			int idade = teclado.nextInt();
			
			if (idade >= 24 && idade <= 30) {
				idadeF++;
				idadequantidade++;
			}
			System.out.println("Mulheres entre 24 e 30 anos com habilitacação com mais de 3 anos: " + idadeF);
		
		}
		
		}
		
		
	}



