package fiado;

import java.util.ArrayList;
import java.util.Scanner;

public class TestandoConsumidor {

	public static void main(String[] args) {
		String nome;
		String telefone;
		ArrayList<Integer> fiados = new ArrayList<Integer>();
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Informe o nome do cliente : "); 
		nome = sc.nextLine();
		System.out.print("Informe seu telefone : "); 
		telefone = sc.nextLine();
		System.out.print("Qual o valor que deseja colocar no fiado ? ");
		valor = sc.nextInt();
		
		
		Consumidor consumidor = new Consumidor(nome,fiados,telefone);

		while (valor > 0) {
			consumidor.adiciona(fiados, valor);
			System.out.print("Digite o proximo valor? ");
			valor = sc.nextInt();
		}
		
		
		
		System.out.println(consumidor.getFiados());
		

	}

}
