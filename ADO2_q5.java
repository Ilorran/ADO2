package ADO2_Q5;
import java.util.Scanner;
public class ADO2_q5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Precisa levandar o valor das mercadorias de seu estabelecimento?");
		System.out.print("Digite o nome do produto: ");
		String produtos = teclado.nextLine();
		System.out.print("Agora digite a quantidade desses produtos: ");
		int quantidade_produtos = teclado.nextInt();
		System.out.print("Agora digite o valor desse produto: ");
		double valor_produtos = teclado.nextDouble();
		
		double final_de_tudo = (quantidade_produtos * valor_produtos);
		
		System.out.println(quantidade_produtos + " x " + valor_produtos + "  =  R$" + final_de_tudo +  " para reabastecer o estoque de " + produtos);

		System.out.print("Deseja acrescentar mais produtos?");
		System.out.println("Se sim: Digite [S], se não, digite [N].");
		System.out.print("Digite: ");
		char decisao = teclado.next().charAt(0);
		boolean positiva = true;
		boolean negativa = false;
		
		while (positiva == true) {
			
			switch(decisao) {
						
		case 's':
			positiva = true;
			Scanner teclado1 = new Scanner(System.in);
			System.out.println("Precisa levandar o valor das mercadorias de seu estabelecimento?");
			System.out.print("Digite o nome do produto: ");
			String produtos11 = teclado1.nextLine();
			System.out.print("Agora digite a quantidade desses produtos: ");
			int quantidade_produtos11 = teclado.nextInt();
			System.out.print("Agora digite o valor desse produto: ");
			double valor_produtos11 = teclado.nextDouble();
			
			double final_de_tudo11 = (quantidade_produtos11 * valor_produtos11);
			
			System.out.println(quantidade_produtos11 + " x " + valor_produtos11 + "  =  R$" + final_de_tudo11 +  " para reabastecer o estoque de " + produtos11);
			
			System.out.print("Deseja acrescentar mais produtos?");
			System.out.println("Se sim: Digite [S], se não, digite [N].");
			System.out.print("Digite: ");
			char decisao1 = teclado.next().charAt(0);
			break;
			
			case 'n':
			
			break;
			}
		}
			
			
			
			
		
	}

}
